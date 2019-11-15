package com.example.redes.controller;

import com.example.redes.entity.Materia;
import com.example.redes.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apimateria")
public class MateriaController {
    @Autowired
    MateriaService service;

    @PostMapping("/save")
    public Materia save(@RequestBody Materia materia){
        service.saveOrUpdate(materia);
        return materia;
    }

    @GetMapping("/list")
    public List<Materia> list(){
        return service.getAllMateria();
    }

    @GetMapping("/list/{id}")
    public Materia getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMateria(@PathVariable (value = "id") Long id){
        service.deleteMateria(id);
        return "Se elimino el id= "+id;
    }
}
