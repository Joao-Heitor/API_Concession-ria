package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.VeiculoDTO;
import br.ufpb.concessionaria.models.Veiculo;
import br.ufpb.concessionaria.service.VeiculoService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class VeiculoController {
    private final VeiculoService veiculoService;
    private final ModelMapper modelMapper;

    public VeiculoController(VeiculoService veiculoService, ModelMapper modelMapper) {
        this.veiculoService = veiculoService;
        this.modelMapper = modelMapper;
    }

    private VeiculoDTO convertToDTO(Veiculo veiculo){
        return modelMapper.map(veiculo, VeiculoDTO.class);
    }

    private Veiculo convertToEntity(VeiculoDTO veiculoDTO){
        return modelMapper.map(veiculoDTO, Veiculo.class);
    }

    @PostMapping(path = "/veiculo")
    VeiculoDTO createVeiculo(@RequestBody VeiculoDTO veiculoDTO) {
        Veiculo veiculo = convertToEntity(veiculoDTO);
        Veiculo salvo = veiculoService.createVeiculo(veiculo);
        return convertToDTO(salvo);
    }

    @GetMapping(path = "/veiculos")
    List<Veiculo> listVeiculos() {
        return veiculoService.listVeiculos();
    }

    @GetMapping("/veiculos/{veiculoId}")
    public VeiculoDTO getVeiculo(@PathVariable Long veiculoId) {
        Veiculo veiculo = veiculoService.getVeiculo(veiculoId);
        System.out.println(veiculo.toString());
        return convertToDTO(veiculo);
    }


    @PutMapping("/veiculos/{veiculoId}")
    public VeiculoDTO updateVeiculo(@PathVariable Long veiculoId, @RequestBody VeiculoDTO veiculoDTO) {
        Veiculo veiculo = convertToEntity(veiculoDTO);
        Veiculo veiculoAtualizado = veiculoService.updateVeiculo(veiculoId, veiculo);
        return convertToDTO(veiculoAtualizado);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/veiculo/{veiculoId}")
    public void deleteVeiculo(@PathVariable Long veiculoId) {
        veiculoService.deleteVeiculo(veiculoId);
    }

}
