package br.ufpb.concessionaria.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Usuario{
    @Column(name = "cnh")
    private String cnh;
    @OneToMany(mappedBy = "id")
    @JoinColumn(name = "venda_id")
    private Collection<Venda> vendas;
    public Cliente() {
        super();
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Collection<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(Collection<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cnh='" + cnh + '\'' +
                ", vendas=" + vendas +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
