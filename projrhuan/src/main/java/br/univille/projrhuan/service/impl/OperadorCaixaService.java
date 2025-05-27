package br.univille.projrhuan.service.impl;

import java.util.List;

import br.univille.projrhuan.entity.OperadorCaixa;

public interface OperadorCaixaService {
            OperadorCaixa save(OperadorCaixa operadorCaixa);
    List<OperadorCaixa> getAll();
    OperadorCaixa getById(Long id);
    OperadorCaixa delete(Long id);

        void save(Object OperadorCaixaAntigo);

    Object getById(long id);

    void delete(long id);
}
