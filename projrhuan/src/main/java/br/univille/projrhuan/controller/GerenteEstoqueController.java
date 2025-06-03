package br.univille.projrhuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projrhuan.entity.GerenteEstoque;
import br.univille.projrhuan.service.GerenteEstoqueService;

@RestController
@RequestMapping("/gerente-estoque")
public class GerenteEstoqueController {
    @Autowired
    private GerenteEstoqueService service;
    
    @GetMapping
    public ResponseEntity<List<GerenteEstoque>> getGerentesEstoque(){
        List<GerenteEstoque> listaGerentesEstoque = service.getAll();
        return ResponseEntity.ok(listaGerentesEstoque);
    }
    
    @PostMapping
    public ResponseEntity<GerenteEstoque> postGerenteEstoque(@RequestBody GerenteEstoque gerenteEstoque){
        if(gerenteEstoque == null){
            return ResponseEntity.badRequest().build();
        }
        if(gerenteEstoque.getId() == 0){
            service.save(gerenteEstoque);
            return ResponseEntity.ok(gerenteEstoque);
        }
        return ResponseEntity.badRequest().build();
    }
}
