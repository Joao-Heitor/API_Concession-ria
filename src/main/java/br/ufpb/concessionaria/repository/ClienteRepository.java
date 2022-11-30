package br.ufpb.concessionaria.repository;

import br.ufpb.concessionaria.models.Cliente;
import br.ufpb.concessionaria.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Usuario findByUsername(String username);
}
