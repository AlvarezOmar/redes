package com.example.redes.controller;

import com.example.redes.entity.Carrera;
import com.example.redes.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apicarrera")
public class CarreraController {

    @Autowired
    CarreraService service;

    @PostMapping("/save")
    public Carrera save(@RequestBody Carrera carrera){
        service.saveOrUpdate(carrera);
        return carrera;
    }

    @GetMapping("/list")
    public List<Carrera> list(){
        return service.getAllCarrera();
    }

    @GetMapping("/list/{id}")
    public Carrera getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCarrera(@PathVariable (value = "id") Long id){
        service.deleteCarrera(id);
        return "Se elimino el id= " +id;
    }

}

