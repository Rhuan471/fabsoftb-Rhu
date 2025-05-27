package br.univille.projrhuan.service;

public interface AdministradorService {

    Object getAll();

    void save(Object clienteAntigo);

    Object getById(long id);

    void delete(long id);

}
