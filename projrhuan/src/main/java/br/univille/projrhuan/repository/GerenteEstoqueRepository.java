package br.univille.projrhuan.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.GerenteEstoque;

@Repository
public interface GerenteEstoqueRepository extends JpaRepository<GerenteEstoque, Long> {
    
    public interface GerenteEstoqueRepositorio {
        Optional<GerenteEstoque> buscarPorId(Long id);
        List<GerenteEstoque> listarTodos();
        void salvar(GerenteEstoque GerenteEstoque);
        void atualizar(GerenteEstoque GerenteEstoque);
        void deletar(Long id);
    }
}
