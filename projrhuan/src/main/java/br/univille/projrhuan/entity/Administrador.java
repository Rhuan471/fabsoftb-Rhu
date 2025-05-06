package br.univille.projrhuan.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String registro;
    @OneToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name="admininstrador_id")
    private List<OperadorCaixa> operadoresSupervisionados;
    public List<OperadorCaixa> getOperadoresSupervisionados() {
        return operadoresSupervisionados;
    }
        @OneToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
        @JoinColumn(name="admininstrador_id")
        private List<Farmaceutico> farmaceuticoSupervisionados = new ArrayList<>();
    
        public List<Farmaceutico> getFarmaceuticoSupervisionados() {
            return farmaceuticoSupervisionados;
        }

        public void setFarmaceuticoSupervisionados(List<Farmaceutico> farmaceuticoSupervisionados) {
            this.farmaceuticoSupervisionados = farmaceuticoSupervisionados;
        }

        public void adicionarFarmaceuticoSupervisionado(Farmaceutico farmaceutico) {
            farmaceuticoSupervisionados.add(farmaceutico);
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
        throw new UnsupportedOperationException("Unimplemented method 'adicionarOperadorSupervisionado'");
    }

}
