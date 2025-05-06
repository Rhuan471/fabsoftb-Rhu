package br.univille.projrhuan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class GerenteEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome;
    private String identificacao;
    @ManyToOne
    private Administrador administradorResponsavel;

    public GerenteEstoque(String nome, String identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Administrador getAdministradorResponsavel() {
        return administradorResponsavel;
    }

    public void setAdministradorResponsavel(Administrador administradorResponsavel) {
        this.administradorResponsavel = administradorResponsavel;
    }

    @Override
    public String toString() {
        return "GerenteDeEstoque{" +
            "nome='" + nome + '\'' +
            ", identificacao='" + identificacao + '\'' +
            (administradorResponsavel != null ? ", administradorResponsavel=" + administradorResponsavel.getNome() : "") +
            '}';
    }
}
