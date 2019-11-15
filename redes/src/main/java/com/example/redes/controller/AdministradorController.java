package com.example.redes.controller;

import com.example.redes.entity.Administrador;
import com.example.redes.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apiadministrador")
public class AdministradorController {
    @Autowired
    AdministradorService service;

    @PostMapping("/save")
    public Administrador save(@RequestBody Administrador administrador){
        service.saveOrUpdate(administrador);
        return administrador;
    }

    @GetMapping("/list")
    public List<Administrador> list(){
        return service.getAllAdministrador();
    }

    @GetMapping("/list/{id}")
    public Administrador getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAdministrador(@PathVariable (value = "id") Long id){
        service.deleteAdministrador(id);
        return "Se elimino el id= " +id;
    }

}
