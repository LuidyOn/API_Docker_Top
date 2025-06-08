package com.example.pessoaapi.model; //o que representa e como funciona essa estrutura package?

public class Pessoa {
    private Long id; // pq usar o long?
    private String nome;
    private int idade;
    private String cargo;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}