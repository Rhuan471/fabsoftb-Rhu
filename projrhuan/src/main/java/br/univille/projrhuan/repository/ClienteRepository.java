package br.univille.projrhuan.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

    public interface ClienteRepositorio {
        Optional<Cliente> buscarPorId(Long id);
        List<Cliente> listarTodos();
        void salvar(Cliente cliente);
        void atualizar(Cliente cliente);
        void deletar(Long id);
    }
}
