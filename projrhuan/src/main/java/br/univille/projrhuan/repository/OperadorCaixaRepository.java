package br.univille.projrhuan.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.OperadorCaixa;

@Repository
public interface OperadorCaixaRepository extends JpaRepository<OperadorCaixa, String> {
@Override
    Optional<OperadorCaixa> findById(String id);
@Override
    List<OperadorCaixa> findAll();
@Override
    <S extends OperadorCaixa> S save(S entity);
@Override
    void deleteById(String id);
    void update(OperadorCaixa operadorCaixa);
}
