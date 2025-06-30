package br.univille.projrhuan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projrhuan.entity.Medicamento;
import br.univille.projrhuan.repository.MedicamentoRepository;
import br.univille.projrhuan.service.MedicamentoService;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoRepository repository;

    @Override
    public List<Medicamento> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Medicamento> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    @Override
    public List<Medicamento> buscarPorPrincipioAtivo(String principioAtivo) {
        return repository.findByPrincipioAtivoContainingIgnoreCase(principioAtivo);
    }

    @Override
    public List<Medicamento> buscarPorCodigoBarras(String codigoBarras) {
        return repository.findByCodigoBarras(codigoBarras);
    }

    @Override
    public List<Medicamento> buscarDisponiveis() {
        return repository.findByQuantidadeEmEstoqueGreaterThan(0);
    }

    @Override
    public void save(Medicamento medicamento) {
        repository.save(medicamento);
    }

    @Override
    public Medicamento findById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
