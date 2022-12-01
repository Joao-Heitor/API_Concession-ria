package br.ufpb.concessionaria.models;

public class Venda {
    private Long id;
    private Cliente clienteId;
    private Vendedor vendedorId;
    private Veiculo veiculoId;

    public Venda(Cliente clienteId, Vendedor vendedorId, Veiculo veiculoId) {
        this.clienteId = clienteId;
        this.vendedorId = vendedorId;
        this.veiculoId = veiculoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public Vendedor getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Vendedor vendedorId) {
        this.vendedorId = vendedorId;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", vendedorId=" + vendedorId +
                ", veiculoId=" + veiculoId +
                '}';
    }
}
