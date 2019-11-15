package com.example.redes.controller;

import com.example.redes.entity.Genero;
import com.example.redes.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apigenero")
public class GeneroController {

    @Autowired
    GeneroService service;

    @PostMapping("/save")
    public Genero save(@RequestBody Genero genero){
        service.saveOrUpdate(genero);
        return genero;
    }

    @GetMapping("/list")
    public List<Genero> list(){
        return service.getAllGenero();
    }

    @GetMapping("/list/{id}")
    public Genero getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGenero(@PathVariable (value = "id") Long id){
        service.deleteGenero(id);
        return "Se elimino el id= "+id;
    }

}
