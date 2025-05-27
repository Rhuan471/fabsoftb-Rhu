package br.univille.projrhuan.service;

import java.util.List;

import br.univille.projrhuan.entity.Administrador;

public interface AdministradorService {
        Administrador save(Administrador administrador);
    List<Administrador> getAll();
    Administrador getById(Long id);
    Administrador delete(Long id);

    void save(Object AdministradorAntigo);

    Object getById(long id);

    void delete(long id);

}
