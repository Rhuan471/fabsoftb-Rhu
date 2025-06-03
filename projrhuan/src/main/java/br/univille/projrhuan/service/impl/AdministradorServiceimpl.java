package br.univille.projrhuan.service.impl;

import java.util.List;

import br.univille.projrhuan.entity.Administrador;
import br.univille.projrhuan.repository.AdministradorRepository;
import br.univille.projrhuan.service.AdministradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceimpl implements AdministradorService {
    @Autowired
    private AdministradorRepository repository;

    @Override
    public Administrador save(Administrador administrador) {
        return repository.save(administrador);
    }

    @Override
    public List<Administrador> getAll() {
        return repository.findAll();   
    }

    @Override
    public Administrador getById(Long id) {
        var retorno =repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;    
    }

    @Override
    public Administrador delete(Long id) {
        var Administrador = getById(id);
        if(Administrador != null)
            repository.deleteById(id);
        return Administrador;   
    }

    

   
}