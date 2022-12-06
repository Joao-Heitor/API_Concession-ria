package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.ClienteDTO;
import br.ufpb.concessionaria.models.Cliente;
import br.ufpb.concessionaria.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping(path = "/api")
public class ClienteController {
    private final ClienteService clienteService;
    private final ModelMapper modelMapper;

    public ClienteController(ClienteService clienteService, ModelMapper modelMapper) {
        this.clienteService = clienteService;
        this.modelMapper = modelMapper;
    }

    private ClienteDTO convertToDTO(Cliente cliente){
        return modelMapper.map(cliente, ClienteDTO.class);
    }

    private Cliente convertToEntity(ClienteDTO clienteDTO){
        return modelMapper.map(clienteDTO, Cliente.class);
    }

    @PostMapping(path = "/cliente")
    public ClienteDTO createCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = (Cliente) convertToEntity(clienteDTO);
        Cliente salvo = clienteService.createCliente(cliente);
        return convertToDTO(salvo);
    }

    @GetMapping(path = "/clientes")
    public List<Cliente> listClientes() {
        return clienteService.listCliente();
    }

    @GetMapping("/cliente/{clienteId}")
    public ClienteDTO getCliente(@Valid @PathVariable Long clienteId) {
        Cliente cliente = clienteService.getCliente(clienteId);
        System.out.println(cliente.toString());
        return convertToDTO(cliente);
    }

    @PutMapping("/cliente/{clienteId}")
    public ClienteDTO updateCliente(@Valid @PathVariable Long clienteId, @RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = convertToEntity(clienteDTO);
        Cliente clienteUpdated = clienteService.updateCliente(clienteId, cliente);
        return convertToDTO(clienteUpdated);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/cliente/{clienteId}")
    public void deleteCliente(@Valid @PathVariable Long clienteId) {
        clienteService.deleteCliente(clienteId);
    }

}
