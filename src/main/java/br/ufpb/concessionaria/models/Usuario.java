package br.ufpb.concessionaria.models;

public class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String email;

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

    //    @Column(name = "username", nullable = false, unique = true)
//    private String username;
//
//    @Column(name = "password", nullable = false)
//    private String password;

}
