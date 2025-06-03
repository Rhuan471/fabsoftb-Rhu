package br.univille.projrhuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long>{

}
