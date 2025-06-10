package br.univille.projrhuan.service;

import java.util.List;

import br.univille.projrhuan.entity.OperadorCaixa;

public interface OperadorCaixaService {
            OperadorCaixa save(OperadorCaixa operadorCaixa);
    List<OperadorCaixa> getAll();
    OperadorCaixa getById(Long id);

}
