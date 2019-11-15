package com.example.redes.service;

import com.example.redes.entity.Carrera;

import java.util.List;

public interface CarreraService {

    public List<Carrera> getAllCarrera();

    public Carrera getById (Long id);

    public void saveOrUpdate (Carrera carrera);

    public void deleteCarrera(Long id);

}

