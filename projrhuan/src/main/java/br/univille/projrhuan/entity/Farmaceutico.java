package br.univille.projrhuan.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Farmaceutico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Corrected primary key

    private String nome;
    private String crf;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Administrador administrador; // Properly defined relationship

    // Default constructor (required by JPA)
    public Farmaceutico() {
    }

    // Parameterized constructor
    public Farmaceutico(String nome, String crf) {
        this.nome = nome;
        this.crf = crf;
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

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Farmaceutico{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", crf='" + crf + '\'' +
            '}';
    }
}