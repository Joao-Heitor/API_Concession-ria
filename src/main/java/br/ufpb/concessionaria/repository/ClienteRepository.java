package br.ufpb.concessionaria.repository;

import br.ufpb.concessionaria.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByUsername(String username);
}
