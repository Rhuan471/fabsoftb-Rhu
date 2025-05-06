package br.univille.projrhuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long>{
    // Optional<Administrador> findById(Long id);
    // List<Administrador> findAll();
    // <S extends Administrador> S save(S entity);
    // void deleteById(Long id);
    // void update(Administrador administrador);

}
