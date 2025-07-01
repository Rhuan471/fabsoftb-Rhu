package br.univille.projrhuan.service;

import java.util.List;

import br.univille.projrhuan.entity.Medicamento;

public interface MedicamentoService {
    List<Medicamento> getAll();
    List<Medicamento> buscarPorNome(String nome);
    List<Medicamento> buscarPorPrincipioAtivo(String principioAtivo);
    List<Medicamento> buscarPorCodigoBarras(String codigoBarras);
    List<Medicamento> buscarDisponiveis();
    void save(Medicamento medicamento);
    Medicamento findById(long id);
    void delete(long id);
}
