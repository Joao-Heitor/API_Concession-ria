package br.ufpb.concessionaria.repository;

import br.ufpb.concessionaria.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Veiculo findByUsername(String username);
}


