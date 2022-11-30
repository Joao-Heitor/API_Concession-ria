package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.ClienteDTO;
import br.ufpb.concessionaria.models.Cliente;
import br.ufpb.concessionaria.models.Usuario;
import br.ufpb.concessionaria.service.ClienteService;
import br.ufpb.concessionaria.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    private Usuario convertToEntity(ClienteDTO clienteDTO){
        return modelMapper.map(clienteDTO, Usuario.class);
    }

    @PostMapping(path = "/cliente")
    public ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = (Cliente) convertToEntity(clienteDTO);
        Cliente salvo = clienteService.createCriente(cliente);
        return convertToDTO(salvo);
    }

    @GetMapping(path = "/clientes")
    public List<Usuario> listUsuarios() {
        return clienteService.listCliente();
    }

    @GetMapping("/cliente/{clienteId}")
    public ClienteDTO getUsuario(@PathVariable Long usuarioId) {
        Cliente cliente = clienteService.getCliente(usuarioId);
        System.out.println(cliente.toString());
        return convertToDTO(cliente);
    }


    @PutMapping("/cliente/{clienteId}")
    public ClienteDTO updateTask(@PathVariable Long usuarioId, @RequestBody ClienteDTO clienteDTO) {
        Usuario u = convertToEntity(clienteDTO);
        Usuario usuarioAtualizado = clienteService.updateCliente(usuarioId, u);
        return convertToDTO(usuarioAtualizado);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/cliente/{clienteId}")
    public void deleteUsuario(@PathVariable Long usuarioId) {
        clienteService.deleteUsuario(usuarioId);
    }

}
