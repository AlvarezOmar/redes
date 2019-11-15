package com.example.redes.service;

import com.example.redes.entity.Administrador;

import java.util.List;

public interface AdministradorService {
    public List<Administrador> getAllAdministrador();

    public Administrador getById (Long id);

    public void saveOrUpdate (Administrador administrador);

    public void deleteAdministrador(Long id);
}
