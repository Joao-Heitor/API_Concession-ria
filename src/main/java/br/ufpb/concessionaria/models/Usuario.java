package br.ufpb.concessionaria.models;

import javax.persistence.*;

@MappedSuperclass
@Table(name = "tb_usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Usuario_id")
    protected Long id;
    @Column(name = "nome")
    protected String nome;
    @Column(name = "cpf")
    protected String cpf;
    @Column(name = "email")
    protected String email;

    public Usuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
