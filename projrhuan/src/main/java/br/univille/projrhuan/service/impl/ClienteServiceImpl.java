package br.univille.projrhuan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projrhuan.entity.Cliente;
import br.univille.projrhuan.repository.ClienteRepository;
import br.univille.projrhuan.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente getById(Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public Cliente delete(Long id) {
        Cliente cliente = getById(id);
        if (cliente != null) {
            repository.delete(cliente);
        }
        return cliente;
    }
}
