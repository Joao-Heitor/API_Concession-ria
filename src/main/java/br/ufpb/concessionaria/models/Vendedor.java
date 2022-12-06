package br.ufpb.concessionaria.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tb_vendedor")
@PrimaryKeyJoinColumn(name = "VendedorId")
public class Vendedor extends Usuario {
    @Column(name = "salario")
    private String salario;

    @OneToMany(mappedBy = "id")
    private Collection<Venda> vendas;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    public Vendedor() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Collection<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(Collection<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "salario='" + salario + '\'' +
                ", vendas=" + vendas +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
