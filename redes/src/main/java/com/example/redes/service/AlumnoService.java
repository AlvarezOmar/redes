package com.example.redes.service;

import com.example.redes.entity.Alumno;

import java.util.List;

public interface AlumnoService {

    public List<Alumno> getAllAlumno();

    public Alumno getById (Long id);

    public void saveOrUpdate (Alumno alumno);

    public void deleteAlumno(Long id);
}
