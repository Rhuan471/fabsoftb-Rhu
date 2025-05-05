package br.univille.projrhuan.entity;

import java.util.List;

public class Administrador {
    private long id;
    private String nome;
    private String registro;
    private List<OperadorCaixa> operadoresSupervisionados;
    public List<OperadorCaixa> getOperadoresSupervisionados() {
        return operadoresSupervisionados;
    }


    public void setOperadoresSupervisionados(List<OperadorCaixa> operadoresSupervisionados) {
        this.operadoresSupervisionados = operadoresSupervisionados;
    }


    public List<Farmaceutico> getFarmaceuticosSupervisionados() {
        return farmaceuticosSupervisionados;
    }


    public void setFarmaceuticosSupervisionados(List<Farmaceutico> farmaceuticosSupervisionados) {
        this.farmaceuticosSupervisionados = farmaceuticosSupervisionados;
    }


    public GerenteEstoque getGerenteDeEstoqueSupervisionado() {
        return gerenteDeEstoqueSupervisionado;
    }


    public void setGerenteDeEstoqueSupervisionado(GerenteEstoque gerenteDeEstoqueSupervisionado) {
        this.gerenteDeEstoqueSupervisionado = gerenteDeEstoqueSupervisionado;
    }

    private List<Farmaceutico> farmaceuticosSupervisionados;
    private GerenteEstoque gerenteDeEstoqueSupervisionado;
    public String getRegistro() {
        return registro;
    }


    public void setRegistro(String registro) {
        this.registro = registro;
    }


    public void setId(long id) {
        this.id = id;
    }


    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    private int telefone;

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
    @Override
    public String toString() {
        return "Administrador{" +
            "nome='" + nome + '\'' +
            ", registro='" + registro + '\'' +
            ", operadoresSupervisionados=" + operadoresSupervisionados.stream().map(OperadorCaixa::getNome).collect(java.util.stream.Collectors.toList()) +
            ", farmaceuticosSupervisionados=" + farmaceuticosSupervisionados.stream().map(Farmaceutico::getNome).collect(java.util.stream.Collectors.toList()) +
            (gerenteDeEstoqueSupervisionado != null ? ", gerenteDeEstoqueSupervisionado=" + gerenteDeEstoqueSupervisionado.getNome() : "") +
            '}';
    }


    public void adicionarOperadorSupervisionado(OperadorCaixa operador1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarOperadorSupervisionado'");
    }

}
