package br.univille.projrhuan.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String registro;

    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private List<OperadorCaixa> operadoresSupervisionados;

    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL)
    private List<Farmaceutico> farmaceuticos = new ArrayList<>();

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private GerenteEstoque gerenteDeEstoqueSupervisionado;

    private int telefone;

    // Getters and setters
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public List<OperadorCaixa> getOperadoresSupervisionados() {
        return operadoresSupervisionados;
    }

    public void setOperadoresSupervisionados(List<OperadorCaixa> operadoresSupervisionados) {
        this.operadoresSupervisionados = operadoresSupervisionados;
    }

    public List<Farmaceutico> getFarmaceuticos() {
        return farmaceuticos;
    }

    public void setFarmaceuticos(List<Farmaceutico> farmaceuticos) {
        this.farmaceuticos = farmaceuticos;
    }

    public GerenteEstoque getGerenteDeEstoqueSupervisionado() {
        return gerenteDeEstoqueSupervisionado;
    }

    public void setGerenteDeEstoqueSupervisionado(GerenteEstoque gerenteDeEstoqueSupervisionado) {
        this.gerenteDeEstoqueSupervisionado = gerenteDeEstoqueSupervisionado;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Administrador{" +
            "nome='" + nome + '\'' +
            ", registro='" + registro + '\'' +
            ", operadoresSupervisionados=" + operadoresSupervisionados.stream().map(OperadorCaixa::getNome).toList() +
            ", farmaceuticos=" + farmaceuticos.stream().map(Farmaceutico::getNome).toList() +
            (gerenteDeEstoqueSupervisionado != null ? ", gerenteDeEstoqueSupervisionado=" + gerenteDeEstoqueSupervisionado.getNome() : "") +
            '}';
    }

    public Object getEndereco() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEndereco'");
    }

    public void setEndereco(Object endereco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEndereco'");
    }

    public Object getDataNascimento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataNascimento'");
    }

    public void setDataNascimento(Object dataNascimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataNascimento'");
    }
}