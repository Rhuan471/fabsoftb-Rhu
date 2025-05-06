package br.univille.projrhuan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OperadorCaixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String matricula;

    public OperadorCaixa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters e Setters
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

    public void adicionarOperadorSupervisionado(Object operador) {
        if (operador instanceof Farmaceutico || operador instanceof OperadorCaixa) {
            // Adiciona o operador à lista de operadores supervisionados
            // (implementação não mostrada aqui, pois não há lista definida na classe)
        } else if (operador instanceof GerenteEstoque) {
            // Adiciona o gerente de estoque à lista de operadores supervisionados
            // (implementação não mostrada aqui, pois não há lista definida na classe)
        } else {
            throw new IllegalArgumentException("Operador deve ser Farmaceutico ou OperadorCaixa");
        }
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
            "nome='" + nome + '\'' +
            ", matricula='" + matricula + '\'' +
            '}';
    }
}
