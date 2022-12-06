package br.ufpb.concessionaria.dto;

import javax.validation.constraints.NotBlank;

public class VeiculoDTO {
    private Long id;
    @NotBlank(message = "Chassi é obrigatório")
    private String chassi;
    @NotBlank(message = "Modelo é obrigatório")
    private String modelo;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Ano é obrigatório")
    private String ano;
    @NotBlank(message = "Cor é obrigatório")
    private String cor;


    public VeiculoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "VeiculoDTO{" +
                "id=" + id +
                ", chassi='" + chassi + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
