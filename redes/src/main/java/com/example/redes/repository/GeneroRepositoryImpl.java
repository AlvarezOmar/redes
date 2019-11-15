package com.example.redes.repository;

import com.example.redes.entity.Genero;
import com.example.redes.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GeneroRepositoryImpl implements GeneroService {
     @Autowired
     GeneroRepository repository;

    @Override
    public List<Genero> getAllGenero() {
        return (List<Genero>)repository.findAll();
    }

    @Override
    public Genero getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Genero genero) {
        repository.save(genero);
    }

    @Override
    public void deleteGenero(Long id) {
        repository.deleteById(id);
    }
}
