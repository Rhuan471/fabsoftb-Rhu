package br.univille.projrhuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projrhuan.entity.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    List<Medicamento> findByNomeContainingIgnoreCase(String nome);
    List<Medicamento> findByPrincipioAtivoContainingIgnoreCase(String principioAtivo);
    List<Medicamento> findByCodigoBarras(String codigoBarras);
    List<Medicamento> findByQuantidadeEmEstoqueGreaterThan(int quantidade);
}
