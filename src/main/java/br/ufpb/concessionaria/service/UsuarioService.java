//package br.ufpb.concessionaria.service;
//
//import br.ufpb.concessionaria.exception.ItemNotFoundException;
//import br.ufpb.concessionaria.models.Usuario;
//import br.ufpb.concessionaria.models.Veiculo;
//import br.ufpb.concessionaria.repository.UsuarioRepository;
//import br.ufpb.concessionaria.repository.VeiculoRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;
//import org.springframework.validation.annotation.Validated;
//
//import javax.persistence.EntityNotFoundException;
//import javax.validation.constraints.Min;
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UsuarioService {
//    private UsuarioRepository usuarioRepository;
//    private VeiculoRepository veiculoRepository;
//
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//
//
//
//    public UsuarioService(UsuarioRepository usuarioRepository,  VeiculoRepository veiculoRepository, BCryptPasswordEncoder bCryptPasswordEncoder){
//        this.usuarioRepository = usuarioRepository;
//        this.veiculoRepository = veiculoRepository;
//    }
//
//    public List<Usuario> listUsuarios() {
//        return usuarioRepository.findAll();
//    }
//    public Usuario getUsuario(Long usuarioId) {
//        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ItemNotFoundException("Usuario " + usuarioId + " not found!"));
//    }
//
//    public Usuario createUsuario(Usuario usuario){
//        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
//        Photo photo = new Photo("www.exemplo.com/foto.png");
//        photoRepository.save(photo);
//        usuario.setPhoto(photo);
//        return usuarioRepository.save(usuario);
//    }
//
//    public Usuario updateUsuario(Long usuarioId, Usuario u) {
//        Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
//        if(usuarioOpt.isPresent()){
//            Usuario usuario = usuarioOpt.get();
//            usuario.setEmail(u.getEmail());
//            usuario.setNome(u.getNome());
//            return usuarioRepository.save(usuario);
//        }
//        return null;
//    }
//
//    public void deleteUsuario(Long usuarioId) {
//        Optional<Usuario> uOpt = usuarioRepository.findById(usuarioId);
//        if(uOpt.isPresent()){
//            Usuario u = uOpt.get();
//            // Remove all boards shared with me
//            u.getBoardsShared().removeAll(u.getBoardsShared());
//
//            // Remove usuarios who share my boards
//            Collection<Board> myBoards = u.getBoards();
//            myBoards.stream().forEach(board -> {
//                Collection<Usuario> usuarios = board.getUsuarios();
//                usuarios.stream().forEach(usuario -> {
//                    usuario.getBoardsShared().remove(board);
//                    usuarioRepository.save(usuario);
//                });
//                boardRepository.save(board);
//            });
//            usuarioRepository.save(u);
//            usuarioRepository.delete(u);
//        }
//
//        throw new ItemNotFoundException("Usuario " + usuarioId + " not found!");
//
//    }
//
//}
