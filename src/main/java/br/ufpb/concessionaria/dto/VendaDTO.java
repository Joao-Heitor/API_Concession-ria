package br.ufpb.concessionaria.dto;

import br.ufpb.concessionaria.models.Cliente;
import br.ufpb.concessionaria.models.Veiculo;
import br.ufpb.concessionaria.models.Vendedor;

import javax.validation.constraints.NotBlank;

public class VendaDTO {
    private Long id;
    @NotBlank(message = "ID Cliente é obrigatório")
    private Cliente clienteId;
    @NotBlank(message = "ID Vendedor é obrigatório")
    private Vendedor vendedorId;
    @NotBlank(message = "ID Veiculo é obrigatório")
    private Veiculo veiculoId;

    public VendaDTO() {
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
        return "VendaDTO{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", vendedorId=" + vendedorId +
                ", veiculoId=" + veiculoId +
                '}';
    }
}
