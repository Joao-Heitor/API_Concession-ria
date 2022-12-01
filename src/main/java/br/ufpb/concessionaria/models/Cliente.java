package br.ufpb.concessionaria.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Usuario{
    @Column(name = "cnh")
    private String cnh;
    public Cliente() {
        super();
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
