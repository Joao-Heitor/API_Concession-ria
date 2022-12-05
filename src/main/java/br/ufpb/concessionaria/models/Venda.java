package br.ufpb.concessionaria.models;

import javax.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "tb_vanda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "venda_id")
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne()
    @JoinColumn(name = "vendendor_id")
    private Vendedor vendedor;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Collection<Veiculo> veiculos;

    public Venda(Cliente cliente, Vendedor vendedor, Collection<Veiculo> veiculos) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculos = veiculos;
    }

    public Venda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Collection<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Collection<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", veiculos=" + veiculos +
                '}';
    }
}
