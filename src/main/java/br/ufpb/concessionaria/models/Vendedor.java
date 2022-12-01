package br.ufpb.concessionaria.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_vendedor")
public class Vendedor extends Usuario{
    @Column(name = "salario")
    private String salario;
    public Vendedor() {
        super();
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
