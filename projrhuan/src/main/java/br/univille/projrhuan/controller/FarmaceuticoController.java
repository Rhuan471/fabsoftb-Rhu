package br.univille.projrhuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.univille.projrhuan.entity.Farmaceutico;
import br.univille.projrhuan.service.FarmaceuticoService;

@Controller
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {
    @Autowired
    private FarmaceuticoService service;
    
    @GetMapping
    public ResponseEntity<List<Farmaceutico>> getFarmaceuticos(){
        var listaFarmaceuticos = service.getAll();
        return new ResponseEntity<List<Farmaceutico>>(listaFarmaceuticos, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Farmaceutico> postFarmaceutico(@RequestBody Farmaceutico farmaceutico){
        if(farmaceutico == null){
            return ResponseEntity.badRequest().build();
        }
    if(farmaceutico.getId() == 0){
            service.save(farmaceutico);
            return new ResponseEntity<Farmaceutico>(farmaceutico, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }
}
