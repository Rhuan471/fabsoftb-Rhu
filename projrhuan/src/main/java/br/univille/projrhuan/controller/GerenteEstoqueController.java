package br.univille.projrhuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.univille.projrhuan.entity.GerenteEstoque;

public class GerenteEstoqueController {
    @Autowired
    private GerenteEstoqueService service;
    
    @GetMapping
    public ResponseEntity<List<GerenteEstoque>> getGerentesEstoque(){
        var listaGerentesEstoque = service.getAll();
        return new ResponseEntity<List<GerenteEstoque>>(listaGerentesEstoque, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<GerenteEstoque> postGerenteEstoque(@RequestBody GerenteEstoque gerenteEstoque){
        if(gerenteEstoque == null){
        return ResponseEntity.badRequest().build();
    }
    if(gerenteEstoque.getId() == 0){
            service.save(gerenteEstoque);
            return new ResponseEntity<GerenteEstoque>(gerenteEstoque, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }
}
