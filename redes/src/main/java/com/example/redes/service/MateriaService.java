package com.example.redes.service;

import com.example.redes.entity.Materia;

import java.util.List;

public interface MateriaService {

    public List<Materia> getAllMateria();

    public Materia getById (Long id);

    public void saveOrUpdate (Materia materia);

    public void deleteMateria(Long id);
}
