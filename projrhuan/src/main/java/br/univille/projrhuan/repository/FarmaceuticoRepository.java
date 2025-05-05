package br.univille.projrhuan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Farmaceutico;

@Repository
public interface FarmaceuticoRepository extends JpaRepository<Farmaceutico,Long>{
    
}
