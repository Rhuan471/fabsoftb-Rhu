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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projrhuan.entity.Administrador;
@RestController
@RequestMapping("/api/v1/administrador")
public class AdministradorController {

    @Autowired
    private br.univille.projrhuan.service.AdministradorService service;
    @GetMapping
    public ResponseEntity<List<Administrador>> getClientes(){
        var listaClientes = service.getAll();

        return new ResponseEntity<List<Administrador>>((List<Administrador>) listaClientes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Administrador> postCliente(@RequestBody Administrador cliente){
            if(cliente == null){
                return ResponseEntity.badRequest().build();
            }
            if(cliente.getId() == 0){
                service.save(cliente);
                return new ResponseEntity<Administrador>(cliente, HttpStatus.OK);
            }
            return ResponseEntity.badRequest().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Administrador>  putCliente(@PathVariable long id, @RequestBody Administrador cliente){

        if(id <= 0 || cliente == null){
            return ResponseEntity.badRequest().build();
        }
        var clienteAntigo = service.getById(id);
        if(clienteAntigo == null){
            return ResponseEntity.notFound().build();
        }
        ((Administrador) clienteAntigo).setNome(cliente.getNome());
        ((Administrador) clienteAntigo).setEndereco(cliente.getEndereco());
        ((Administrador) clienteAntigo).setTelefone(cliente.getTelefone());
        ((Administrador) clienteAntigo).setDataNascimento(cliente.getDataNascimento());

        service.save(clienteAntigo);
        return new ResponseEntity<Administrador>(clienteAntigo,
        HttpStatus.OK);
    }


	@DeleteMapping("/{id}")
    public ResponseEntity<Administrador> deleteCliente(@PathVariable long id){
        if(id <=0){
            return ResponseEntity.badRequest().build();
        }

        var clienteExcluido = service.getById(id);
        if(clienteExcluido == null){
            return ResponseEntity.notFound().build();
        }
        service.delete(id);

        return new ResponseEntity<Administrador>(clienteExcluido,
                HttpStatus.OK);
    }
}