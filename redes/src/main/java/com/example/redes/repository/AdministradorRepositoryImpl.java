package com.example.redes.repository;

import com.example.redes.entity.Administrador;
import com.example.redes.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdministradorRepositoryImpl implements AdministradorService {
    @Autowired
    AdministradorRepository repository;

    @Override
    public List<Administrador> getAllAdministrador() {
        return (List<Administrador>)repository.findAll();
    }

    @Override
    public Administrador getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Administrador administrador) {
        repository.save(administrador);
    }

    @Override
    public void deleteAdministrador(Long id) {
        repository.deleteById(id);
    }
}
