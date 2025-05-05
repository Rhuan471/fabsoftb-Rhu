package br.univille.projrhuan.entity;
import java.util.ArrayList;
import java.util.List;
public class Farmaceutico {
    private String nome;
    private String crf;
    
    public class Administrador {
        private List<Farmaceutico> farmaceuticoSupervisionados = new ArrayList<>();
    
        // Existing fields and methods
    
        public List<Farmaceutico> getFarmaceuticoSupervisionados() {
            return farmaceuticoSupervisionados;
        }

        public void setFarmaceuticoSupervisionados(List<Farmaceutico> farmaceuticoSupervisionados) {
            this.farmaceuticoSupervisionados = farmaceuticoSupervisionados;
        }

        public void adicionarFarmaceuticoSupervisionado(Farmaceutico farmaceutico) {
            farmaceuticoSupervisionados.add(farmaceutico);
        }
    
        @Override
        public String toString() {
            return "Administrador{" +
                    "farmaceuticosSupervisionados=" + farmaceuticoSupervisionados +
                    '}';
        }
    }

    public Farmaceutico(String nome, String crf) {
        this.nome = nome;
        this.crf = crf;
    }

    // Getters e Setters
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
        // Adiciona o farmaceutico à lista de farmaceuticos supervisionados
        // (implementação não mostrada aqui, pois não há lista definida na classe)
    }

    @Override
    public String toString() {
        return "Farmaceutico{" +
            "nome='" + nome + '\'' +
            ", crf='" + crf + '\'' +
            '}';
    }
}
