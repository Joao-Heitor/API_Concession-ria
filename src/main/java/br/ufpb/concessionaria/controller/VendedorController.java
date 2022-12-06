package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.VendedorDTO;
import br.ufpb.concessionaria.models.Vendedor;
import br.ufpb.concessionaria.service.VendedorService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class VendedorController {
    private final VendedorService vendedorService;
    private final ModelMapper modelMapper;

    public VendedorController(VendedorService vendedorService, ModelMapper modelMapper) {
        this.vendedorService = vendedorService;
        this.modelMapper = modelMapper;
    }

    private VendedorDTO convertToDTO(Vendedor vendedor){
        return modelMapper.map(vendedor, VendedorDTO.class);
    }

    private Vendedor convertToEntity(VendedorDTO vendedorDTO){
        return modelMapper.map(vendedorDTO, Vendedor.class);
    }

    @PostMapping(path = "/vendedor")
    VendedorDTO createVendedor(@Valid @RequestBody VendedorDTO vendedorDTO) {
        Vendedor vendedor = convertToEntity(vendedorDTO);
        Vendedor salved = vendedorService.createVendedor(vendedor);
        return convertToDTO(salved);
    }

    @GetMapping(path = "/vendedores")
    List<Vendedor> listVendedores() {
        return vendedorService.listVendedores();
    }

    @GetMapping("/vendedor/{vendedorId}")
    public VendedorDTO getVendedor(@Valid @PathVariable Long vendedorId) {
        Vendedor vendedor = vendedorService.getVendedor(vendedorId);
        return convertToDTO(vendedor);
    }


    @PutMapping("/vendedor/{vendedorId}")
    public VendedorDTO updateVendedor(@Valid @PathVariable Long vendedorId, @RequestBody VendedorDTO vendedorDTO) {
        Vendedor vendedor = convertToEntity(vendedorDTO);
        Vendedor vendedorUpdated = vendedorService.updateVendedor(vendedorId, vendedor);
        return convertToDTO(vendedorUpdated);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/vendedor/{vendedorId}")
    public void deleteVendedor(@Valid @PathVariable Long vendedorId) {
        vendedorService.deleteVendedor(vendedorId);
    }

}
