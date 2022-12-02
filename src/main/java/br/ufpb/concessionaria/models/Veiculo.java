package br.ufpb.concessionaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "veiculo_id")
    private Long id;
    @Column(name = "chassi")
    private String chassi;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "ano")
    private String ano;
    @Column(name = "cor")
    private String cor;
    @ManyToOne()
    @JoinColumn(name = "id")
    private Venda venda;

    public Veiculo() {

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

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", chassi='" + chassi + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", cor='" + cor + '\'' +
                ", venda=" + venda +
                '}';
    }
}
