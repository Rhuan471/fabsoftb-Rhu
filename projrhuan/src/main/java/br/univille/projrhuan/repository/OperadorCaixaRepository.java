package br.univille.projrhuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.OperadorCaixa;

@Repository
public interface OperadorCaixaRepository extends JpaRepository<OperadorCaixa,Long>{

}