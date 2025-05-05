package br.univille.projrhuan.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Cliente {

    public Cliente(String joão_Silva, String string, String rua_das_Flores_123) {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    public String getCpf() {
        return cpf;


    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String endereco;
    private String telefone;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    private Farmaceutico farmaceuticoResponsavel;
    private OperadorCaixa operadorDeCaixaResponsavel;
    

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
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Farmaceutico getFarmaceuticoResponsavel() {
        return farmaceuticoResponsavel;
    }

    public void setFarmaceuticoResponsavel(Farmaceutico farmaceuticoResponsavel) {
        this.farmaceuticoResponsavel = farmaceuticoResponsavel;
    }

    public OperadorCaixa getOperadorDeCaixaResponsavel() {
        return operadorDeCaixaResponsavel;
    }

    public void setOperadorDeCaixaResponsavel(OperadorCaixa operadorDeCaixaResponsavel) {
        this.operadorDeCaixaResponsavel = operadorDeCaixaResponsavel;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", endereco='" + endereco + '\'' +
            (farmaceuticoResponsavel != null ? ", farmaceuticoResponsavel=" + farmaceuticoResponsavel.getNome() : "") +
            (operadorDeCaixaResponsavel != null ? ", operadorDeCaixaResponsavel=" + operadorDeCaixaResponsavel.getNome() : "") +
            '}';
    }
}
