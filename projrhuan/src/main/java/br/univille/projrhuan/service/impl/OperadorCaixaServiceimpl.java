package br.univille.projrhuan.service.impl;

import java.util.List;

import br.univille.projrhuan.entity.OperadorCaixa;
import br.univille.projrhuan.repository.OperadorCaixaRepository;
import br.univille.projrhuan.service.OperadorCaixaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperadorCaixaServiceimpl implements OperadorCaixaService { 
    @Autowired
    private OperadorCaixaRepository operadorCaixaRepository;

    @Override
    public OperadorCaixa save(OperadorCaixa operadorCaixa) {
        
    }

    @Override
    public List<OperadorCaixa> getAll() {
        
    }

    @Override
    public OperadorCaixa getById(Long id) {
        
    }

    @Override
    public OperadorCaixa delete(Long id) {
        
    }


}