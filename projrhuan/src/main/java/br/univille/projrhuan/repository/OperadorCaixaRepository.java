package br.univille.projrhuan.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.OperadorCaixa;

@Repository
public interface OperadorCaixaRepository extends JpaRepository<OperadorCaixa, Long> {
    
    public interface OperadorCaixaRepositorio {
        Optional<OperadorCaixa> buscarPorId(Long id);
        List<OperadorCaixa> listarTodos();
        void salvar(OperadorCaixa OperadorCaixa);
        void atualizar(OperadorCaixa OperadorCaixa);
        void deletar(Long id);
    }
}