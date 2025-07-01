package br.univille.projrhuan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String principioAtivo;
    private String codigoBarras;
    private int quantidadeEmEstoque;
    private double preco;

    // Constructors
    public Medicamento() {
    }

    public Medicamento(String nome, String principioAtivo, String codigoBarras, int quantidadeEmEstoque, double preco) {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.codigoBarras = codigoBarras;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
               "nome='" + nome + '\'' +
               ", principioAtivo='" + principioAtivo + '\'' +
               ", codigoBarras='" + codigoBarras + '\'' +
               ", quantidadeEmEstoque=" + quantidadeEmEstoque +
               ", preco=" + preco +
               '}';
    }
}
