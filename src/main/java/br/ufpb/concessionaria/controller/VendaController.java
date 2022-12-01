package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.VendaDTO;
import br.ufpb.concessionaria.models.Venda;
import br.ufpb.concessionaria.models.Venda;
import br.ufpb.concessionaria.service.VendaService;
import br.ufpb.concessionaria.service.VendaService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class VendaController {
    private final VendaService vendaService;
    private final ModelMapper modelMapper;

    public VendaController(VendaService vendaService, ModelMapper modelMapper) {
        this.vendaService = vendaService;
        this.modelMapper = modelMapper;
    }

    private VendaDTO convertToDTO(Venda venda){
        return modelMapper.map(venda, VendaDTO.class);
    }

    private Venda convertToEntity(VendaDTO vendaDTO){
        return modelMapper.map(vendaDTO, Venda.class);
    }

    @PostMapping(path = "/venda")
    public VendaDTO createVenda(@RequestBody VendaDTO vendaDTO) {
        Venda venda = (Venda) convertToEntity(vendaDTO);
        Venda salvo = vendaService.createVenda(venda);
        return convertToDTO(salvo);
    }

    @GetMapping(path = "/vendas")
    public List<Venda> listVendas() {
        return vendaService.listVenda();
    }

    @GetMapping("/venda/{vendaId}")
    public VendaDTO getVenda(@PathVariable Long vendaId) {
        Venda venda = vendaService.getVenda(vendaId);
        System.out.println(venda.toString());
        return convertToDTO(venda);
    }


    @PutMapping("/venda/{vendaId}")
    public VendaDTO updateVenda(@PathVariable Long vendaId, @RequestBody VendaDTO vendaDTO) {
        Venda u = convertToEntity(vendaDTO);
        Venda vendaAtualizado = vendaService.updateVenda(vendaId, u);
        return convertToDTO(vendaAtualizado);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/venda/{vendaId}")
    public void deleteVenda(@PathVariable Long vendaId) {
        vendaService.deleteVenda(vendaId);
    }

}
