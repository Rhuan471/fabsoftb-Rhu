package br.univille.projrhuan.service.impl;

import java.util.List;

import br.univille.projrhuan.entity.GerenteEstoque;

public interface GerenteEstoqueService {
                GerenteEstoque save(GerenteEstoque gerenteEstoque);
    List<GerenteEstoque> getAll();
    GerenteEstoque getById(Long id);
    GerenteEstoque delete(Long id);

        void save(Object GerenteEstoqueAntigo);
    Object getById(long id);
    void delete(long id);
}
