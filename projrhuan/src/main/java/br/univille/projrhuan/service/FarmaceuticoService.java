package br.univille.projrhuan.service;

import java.util.List;

import br.univille.projrhuan.entity.Farmaceutico;

public interface FarmaceuticoService {
    Farmaceutico save(Farmaceutico farmaceutico);
    List<Farmaceutico> getAll();
    Farmaceutico getById(Long id);
    Farmaceutico delete(Long id);
}
