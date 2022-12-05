package br.ufpb.concessionaria.repository;

import br.ufpb.concessionaria.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
