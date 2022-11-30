package br.ufpb.concessionaria.models;

public class Cliente extends Usuario{
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
