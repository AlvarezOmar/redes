package com.example.redes.service;

import com.example.redes.entity.Genero;

import java.util.List;

public interface GeneroService {

    public List<Genero> getAllGenero();

    public Genero getById (Long id);

    public void saveOrUpdate (Genero genero);

    public void deleteGenero(Long id);

}
