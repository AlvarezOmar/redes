package com.example.redes.controller;

import com.example.redes.entity.Alumno;
import com.example.redes.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apialumno")
public class AlumnoController {

    @Autowired
    AlumnoService service;

    @PostMapping("/save")
    public Alumno save(@RequestBody Alumno alumno){
        service.saveOrUpdate(alumno);
        return alumno;
    }

    @GetMapping("/list")
    public List<Alumno> list(){
        return service.getAllAlumno();
    }

    @GetMapping("/list/{id}")
    public Alumno getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAlumno(@PathVariable (value = "id") Long id){
        service.deleteAlumno(id);
        return "Se elimino el id= "+id;
    }

}
