package com.example.redes.controller;

import com.example.redes.entity.Material;
import com.example.redes.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apimaterial")
public class MaterialController {
    @Autowired
    MaterialService service;

    @PostMapping("/save")
    public Material save(@RequestBody Material material){
        service.saveOrUpdate(material);
        return material;
    }

    @GetMapping("/list")
    public List<Material> list(){
        return service.getAllMaterial();
    }

    @GetMapping("/list/{id}")
    public Material getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMaterial(@PathVariable (value = "id") Long id){
        service.deleteMaterial(id);
        return "Se elimino el id= "+id;
    }
}
