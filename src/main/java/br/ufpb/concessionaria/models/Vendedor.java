package br.ufpb.concessionaria.models;

public class Vendedor extends Usuario{
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
