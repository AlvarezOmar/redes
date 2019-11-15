package com.example.redes.repository;

import com.example.redes.entity.Carrera;
import com.example.redes.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarreraRepositoryImpl implements CarreraService {
    @Autowired
    CarreraRepository repository;

    @Override
    public List<Carrera> getAllCarrera() {
        return (List<Carrera>)repository.findAll();
    }

    @Override
    public Carrera getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Carrera carrera) {
        repository.save(carrera);
    }

    @Override
    public void deleteCarrera(Long id) {
        repository.deleteById(id);
    }
}

