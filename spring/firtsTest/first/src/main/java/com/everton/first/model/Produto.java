package com.everton.first.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Use Long (Wrapper) em vez de long (primitivo)

    private String nome;
    private Double preco;

    public  Produto(){}

    public  Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters são essenciais para o Hibernate acessar os campos
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
}