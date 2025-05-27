package br.univille.projrhuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.univille.projrhuan.entity.OperadorCaixa;
import br.univille.projrhuan.service.OperadorCaixaService;

public class OperadorCaixaController {
    @Autowired
    private OperadorCaixaService service;
    
    @GetMapping
    public ResponseEntity<List<OperadorCaixa>> getOperadoresCaixa(){
        var listaOperadoresCaixa = service.getAll();
        return new ResponseEntity<List<OperadorCaixa>>(listaOperadoresCaixa, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<OperadorCaixa> postOperadorCaixa(@RequestBody OperadorCaixa operadorCaixa){
        if(operadorCaixa == null){
        return ResponseEntity.badRequest().build();
        }
        if(operadorCaixa.getId() == 0){
            service.save(operadorCaixa);
            return new ResponseEntity<OperadorCaixa>(operadorCaixa, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<OperadorCaixa> putOperadorCaixa(@PathVariable long id, @RequestBody OperadorCaixa operadorCaixa){
        if(id <= 0 || operadorCaixa == null){
            return ResponseEntity.badRequest().build();
        }
        var operadorCaixaAntigo = service.getById(id);
        if(operadorCaixaAntigo == null){
            return ResponseEntity.notFound().build();
        }
        operadorCaixaAntigo.setNome(operadorCaixa.getNome());
        operadorCaixaAntigo.setEndereco(operadorCaixa.getEndereco());
        operadorCaixaAntigo.setTelefone(operadorCaixa.getTelefone());
        operadorCaixaAntigo.setDataNascimento(operadorCaixa.getDataNascimento());
        operadorCaixaAntigo.setSalario(operadorCaixa.getSalario());
        service.save(operadorCaixaAntigo);
        return new ResponseEntity<OperadorCaixa>(operadorCaixaAntigo, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<OperadorCaixa> deleteOperadorCaixa(@PathVariable long id){
        if(id <=0){
            return ResponseEntity.badRequest().build();
        }
        var operadorCaixaExcluido = service.getById(id);
        if(operadorCaixaExcluido == null){
        return ResponseEntity.notFound().build();
        }
        service.delete(operadorCaixaExcluido);
        return ResponseEntity.ok(operadorCaixaExcluido);
    }
}
