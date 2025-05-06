package br.univille.projrhuan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Farmaceutico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String crf;

    public Farmaceutico(String nome, String crf) {
        this.nome = nome;
        this.crf = crf;
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

    public void adicionarFarmaceuticoSupervisionado(Farmaceutico farmaceutico) {

    }

    @Override
    public String toString() {
        return "Farmaceutico{" +
            "nome='" + nome + '\'' +
            ", crf='" + crf + '\'' +
            '}';
    }
}
