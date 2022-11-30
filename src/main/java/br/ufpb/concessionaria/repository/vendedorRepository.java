package br.ufpb.concessionaria.repository;

import br.ufpb.concessionaria.models.Usuario;
import br.ufpb.concessionaria.models.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vendedorRepository extends JpaRepository<Vendedor, Long> {
    Usuario findByUsername(String username);
}
