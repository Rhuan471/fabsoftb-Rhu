package br.univille.projrhuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
