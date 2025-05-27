package br.univille.projrhuan.service;

import java.util.List;

import br.univille.projrhuan.entity.Cliente;

public interface FarmaceuticoService {
    Cliente save(Cliente cliente);
    List<Cliente> getAll();
    Cliente getById(Long id);
    Cliente delete(Long id);

        void save(Object AdministradorAntigo);

    Object getById(long id);

    void delete(long id);
}
