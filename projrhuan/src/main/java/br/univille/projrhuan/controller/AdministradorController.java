package br.univille.projrhuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projrhuan.entity.Administrador;

@RestController
public class AdministradorController {
    @Autowired
    List<Administrador> listaAdministradores = service.getAll();

    return ResponseEntity.ok(listaAdministradores);
    public ResponseEntity<List<Administrador>> getAdministradores(){
    var listaAdministradores = service.getAll();

    return new ResponseEntity<List<Administrador>>(listaAdministradores, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Administrador> postAdministrador(@RequestBody Administrador administrador){
        if(administrador == null){
            return ResponseEntity.badRequest().build();
            }
            if(administrador.getId() == 0){
                service.save(administrador);
                return new ResponseEntity<Administrador>(administrador, HttpStatus.OK);
            }
            return ResponseEntity.badRequest().build();
    }
            if(administrador.getId() == 0){
                service.save(administrador);
                return new ResponseEntity<Administrador>(administrador, HttpStatus.OK);
            }
            return ResponseEntity.badRequest().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Administrador>  putAdministrador(@PathVariable long id, @RequestBody Administrador administrador){
        if(id <= 0 || administrador == null){
            return ResponseEntity.badRequest().build();
        }
        var administradorAntigo = service.getById(id);
        if(administradorAntigo == null){
            return ResponseEntity.notFound().build();
        }
        administradorAntigo.setNome(administrador.getNome());
        administradorAntigo.setEndereco(administrador.getEndereco());
        administradorAntigo.setTelefone(administrador.getTelefone());
        administradorAntigo.setDataNascimento(administrador.getDataNascimento());

        service.save(administradorAntigo);
        return new ResponseEntity<Administrador>(administradorAntigo,
        HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Administrador> deleteAdministrador(@PathVariable long id){
        if(id <=0){
            return ResponseEntity.badRequest().build();
        }

        var administradorExcluido = service.getById(id);
        if(administradorExcluido == null){
            return ResponseEntity.notFound().build();
        }
        service.delete(administradorExcluido);
        return new ResponseEntity<Administrador>(administradorExcluido, HttpStatus.OK);
    }
