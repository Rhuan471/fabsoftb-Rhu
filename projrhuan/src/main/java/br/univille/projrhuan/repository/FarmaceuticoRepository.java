package br.univille.projrhuan.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Farmaceutico;

@Repository
public interface FarmaceuticoRepository extends JpaRepository<Farmaceutico,String>{
    
    public interface FarmaceuticoRepositorio {
        Optional<Farmaceutico> buscarPorId(Long id);
        List<Farmaceutico> listarTodos();
        void salvar(Farmaceutico farmaceutico);
        void atualizar(Farmaceutico farmaceutico);
        void deletar(Long id);
    }
}
