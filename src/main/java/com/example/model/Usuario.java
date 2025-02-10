package com.example.model;
public class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String RG;

    // Construtores
    public Usuario() {}

    public Usuario(Long id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Getters e Setters
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String RG)  {
        this.RG = RG;
    }
}
