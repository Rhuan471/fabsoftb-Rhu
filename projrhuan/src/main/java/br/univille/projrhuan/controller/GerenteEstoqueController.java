package br.univille.projrhuan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projrhuan.entity.GerenteEstoque;
import br.univille.projrhuan.repository.GerenteEstoqueRepository;

@RestController
@RequestMapping("/api/v1/gerente-estoque")
public class GerenteEstoqueController {

    @Autowired
    private GerenteEstoqueRepository gerenteEstoqueRepository;

    // Endpoint to get all GerenteEstoque
    @GetMapping
    public ResponseEntity<List<GerenteEstoque>> getAllGerentesEstoque() {
        List<GerenteEstoque> gerentes = gerenteEstoqueRepository.findAll();
        return new ResponseEntity<>(gerentes, HttpStatus.OK);
    }

    // Endpoint to get a single GerenteEstoque by ID
    @GetMapping("/{id}")
    public ResponseEntity<GerenteEstoque> getGerenteEstoqueById(@PathVariable Long id) {
        Optional<GerenteEstoque> gerente = gerenteEstoqueRepository.findById(id);
        return gerente.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint to create a new GerenteEstoque
    @PostMapping
    public ResponseEntity<GerenteEstoque> createGerenteEstoque(@RequestBody GerenteEstoque gerenteEstoque) {
        GerenteEstoque savedGerente = gerenteEstoqueRepository.save(gerenteEstoque);
        return new ResponseEntity<>(savedGerente, HttpStatus.CREATED);
    }

    // Endpoint to update an existing GerenteEstoque
    @PutMapping("/{id}")
    public ResponseEntity<GerenteEstoque> updateGerenteEstoque(@PathVariable Long id, @RequestBody GerenteEstoque gerenteEstoqueDetails) {
        Optional<GerenteEstoque> gerente = gerenteEstoqueRepository.findById(id);
        if (gerente.isPresent()) {
            GerenteEstoque existingGerente = gerente.get();
            existingGerente.setNome(gerenteEstoqueDetails.getNome());
            existingGerente.setIdentificacao(gerenteEstoqueDetails.getIdentificacao());
            existingGerente.setAdministradorResponsavel(gerenteEstoqueDetails.getAdministradorResponsavel());
            GerenteEstoque updatedGerente = gerenteEstoqueRepository.save(existingGerente);
            return new ResponseEntity<>(updatedGerente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete a GerenteEstoque
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteGerenteEstoque(@PathVariable Long id) {
        try {
            gerenteEstoqueRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}