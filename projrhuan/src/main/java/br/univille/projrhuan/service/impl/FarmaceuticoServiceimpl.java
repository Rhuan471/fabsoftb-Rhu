package br.univille.projrhuan.service.impl;

import java.util.List;

import br.univille.projrhuan.entity.Farmaceutico;
import br.univille.projrhuan.repository.FarmaceuticoRepository;
import br.univille.projrhuan.service.FarmaceuticoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmaceuticoServiceimpl implements FarmaceuticoService {

    @Autowired
    private FarmaceuticoRepository repository;

    @Override
    public Farmaceutico save(Farmaceutico Farmaceutico) {
        repository.save(Farmaceutico);
        return Farmaceutico;

    }

    @Override
    public List<Farmaceutico> getAll() {
        return repository.findAll();
    }

    @Override
    public Farmaceutico getById(Long id) {
        var retorno =repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
        
    }

    @Override
    public Farmaceutico delete(Long id) {
        var Farmaceutico = getById(id);
        if(Farmaceutico != null)
            repository.deleteById(id);
        return Farmaceutico;
    }

   
}