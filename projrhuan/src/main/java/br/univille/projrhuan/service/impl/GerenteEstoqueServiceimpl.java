package br.univille.projrhuan.service.impl;

import java.util.List;

import br.univille.projrhuan.entity.GerenteEstoque;
import br.univille.projrhuan.repository.GerenteEstoqueRepository;
import br.univille.projrhuan.service.GerenteEstoqueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenteEstoqueServiceimpl implements GerenteEstoqueService {

    @Autowired
    private GerenteEstoqueRepository repository;

    @Override
    public GerenteEstoque save(GerenteEstoque gerenteEstoque) {
        return repository.save(gerenteEstoque);
    }

    @Override
    public List<GerenteEstoque> getAll() {
        return repository.findAll();
    }

    @Override
    public GerenteEstoque getById(Long id) {
        var retorno = repository.findById(id);
        if (retorno.isPresent())
            return retorno.get();
        return null;
    }

    @Override
    public GerenteEstoque delete(Long id) {
        var gerenteEstoque = getById(id);
        if (gerenteEstoque != null)
            repository.deleteById(id);
        return gerenteEstoque;
    }
}
