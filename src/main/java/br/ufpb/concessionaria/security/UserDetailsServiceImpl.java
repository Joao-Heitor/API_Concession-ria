package br.ufpb.concessionaria.security;

import br.ufpb.concessionaria.models.Vendedor;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private VendedorRepository vendedorRepository;

    public UserDetailsServiceImpl(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Vendedor vendedor = vendedorRepository.findByUsername(username);
        if (vendedor == null) {
            throw new UsernameNotFoundException(username);
        }
        UserDetails user = org.springframework.security.core.userdetails.User.withUsername(vendedor.getUsername()).password(vendedor.getPassword()).authorities("VENDEDOR").build();
        return user;
    }
}
