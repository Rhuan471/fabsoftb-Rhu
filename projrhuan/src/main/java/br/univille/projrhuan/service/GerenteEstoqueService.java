package br.univille.projrhuan.service;

import java.util.List;

import br.univille.projrhuan.entity.GerenteEstoque;

public interface GerenteEstoqueService {
                GerenteEstoque save(GerenteEstoque gerenteEstoque);
    List<GerenteEstoque> getAll();
    GerenteEstoque getById(Long id);
    GerenteEstoque delete(Long id);

}
