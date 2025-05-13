package br.univille.projrhuan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OperadorCaixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Corrected primary key

    private String nome;
    private String matricula;

    // Default constructor (required by JPA)
    public OperadorCaixa() {
    }

    // Parameterized constructor
    public OperadorCaixa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters and setters
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "OperadorCaixa{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", matricula='" + matricula + '\'' +
            '}';
    }
}