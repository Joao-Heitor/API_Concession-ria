package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.dto.UsuarioDTO;
import br.ufpb.concessionaria.models.Usuario;
import br.ufpb.concessionaria.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final ModelMapper modelMapper;

    public UsuarioController(UsuarioService usuarioService, ModelMapper modelMapper) {
        this.usuarioService = usuarioService;
        this.modelMapper = modelMapper;
    }

    private UsuarioDTO convertToDTO(Usuario usuario){
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    private Usuario convertToEntity(UsuarioDTO usuarioDTO){
        return modelMapper.map(usuarioDTO, Usuario.class);
    }

    @PostMapping(path = "/usuario")
    UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario u = convertToEntity(usuarioDTO);
        Usuario salvo = usuarioService.createUsuario(u);
        return convertToDTO(salvo);
    }

    @GetMapping(path = "/usuarios")
    List<Usuario> listUsuarios() {
        return usuarioService.listUsuarios();
    }

    @GetMapping("/usuarios/{usuarioId}")
    public UsuarioDTO getUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.getUsuario(usuarioId);
        System.out.println(usuario.toString());
        return convertToDTO(usuario);
    }


    @PutMapping("/usuarios/{usuarioId}")
    public UsuarioDTO updateTask(@PathVariable Long usuarioId, @RequestBody UsuarioDTO usuarioDTO) {
        Usuario u = convertToEntity(usuarioDTO);
        Usuario usuarioAtualizado = usuarioService.updateUsuario(usuarioId, u);
        return convertToDTO(usuarioAtualizado);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/usuario/{usuarioId}")
    public void deleteUsuario(@PathVariable Long usuarioId) {
        usuarioService.deleteUsuario(usuarioId);
    }

}
