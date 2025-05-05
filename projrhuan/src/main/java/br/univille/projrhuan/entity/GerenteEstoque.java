package br.univille.projrhuan.entity;
public class GerenteEstoque {
    private String nome;
    private String identificacao;
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
