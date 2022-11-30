package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.ClienteDTO;
import br.ufpb.concessionaria.models.Usuario;
import br.ufpb.concessionaria.service.UsuarioService;
import br.ufpb.concessionaria.service.VendedorService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    private ClienteDTO convertToDTO(Usuario usuario){
        return modelMapper.map(usuario, ClienteDTO.class);
    }

    private Usuario convertToEntity(ClienteDTO clienteDTO){
        return modelMapper.map(clienteDTO, Usuario.class);
    }

    @PostMapping(path = "/vendedor")
    ClienteDTO createUsuario(@RequestBody ClienteDTO clienteDTO) {
        Usuario u = convertToEntity(clienteDTO);
        Usuario salvo = vendedorService.createUsuario(u);
        return convertToDTO(salvo);
    }

    @GetMapping(path = "/vendedores")
    List<Usuario> listUsuarios() {
        return vendedorService.listUsuarios();
    }

    @GetMapping("/vendedor/{vendedorId}")
    public ClienteDTO getUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = vendedorService.getUsuario(usuarioId);
        System.out.println(usuario.toString());
        return convertToDTO(usuario);
    }


    @PutMapping("/vendedor/{vendedorId}")
    public ClienteDTO updateTask(@PathVariable Long usuarioId, @RequestBody ClienteDTO clienteDTO) {
        Usuario u = convertToEntity(clienteDTO);
        Usuario usuarioAtualizado = vendedorService.updateUsuario(usuarioId, u);
        return convertToDTO(usuarioAtualizado);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/vendedor/{vendedorId}")
    public void deleteUsuario(@PathVariable Long usuarioId) {
        vendedorService.deleteUsuario(usuarioId);
    }

}
