package com.example.redes.service;

import com.example.redes.entity.Docente;

import java.util.List;

public interface DocenteService {

    public List<Docente> getAllDocente();

    public Docente getById (Long id);

    public void saveOrUpdate (Docente docente);

    public void deleteDocente(Long id);
}
