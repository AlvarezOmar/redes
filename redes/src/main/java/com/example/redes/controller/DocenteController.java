package com.example.redes.controller;

import com.example.redes.entity.Docente;
import com.example.redes.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apidocente")
public class DocenteController {
    @Autowired
    DocenteService service;

    @PostMapping("/save")
    public Docente save(@RequestBody Docente docente){
        service.saveOrUpdate(docente);
        return docente;
    }

    @GetMapping("/list")
    public List<Docente> list(){
        return service.getAllDocente();
    }

    @GetMapping("/list/{id}")
    public Docente getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDocente(@PathVariable (value = "id") Long id){
        service.deleteDocente(id);
        return "Se elimino el id= "+id;
    }

}

