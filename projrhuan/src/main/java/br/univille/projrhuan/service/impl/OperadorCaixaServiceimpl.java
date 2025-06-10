package br.univille.projrhuan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projrhuan.entity.OperadorCaixa;
import br.univille.projrhuan.repository.OperadorCaixaRepository;
import br.univille.projrhuan.service.OperadorCaixaService;

@Service
public class OperadorCaixaServiceimpl implements OperadorCaixaService { 
    @Autowired
    private OperadorCaixaRepository OperadorCaixaRepository;

    @Override
    public OperadorCaixa save(OperadorCaixa operadorCaixa) {
        return OperadorCaixaRepository.save(operadorCaixa);
    }

    @Override
    public List<OperadorCaixa> getAll() {
        return OperadorCaixaRepository.findAll();
    }

    @Override
    public OperadorCaixa getById(Long id) {
        var retorno = OperadorCaixaRepository.findById(id);
        if (retorno.isPresent())
            return retorno.get();
        return null;
    }
}