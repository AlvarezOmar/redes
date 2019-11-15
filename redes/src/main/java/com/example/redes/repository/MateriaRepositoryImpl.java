package com.example.redes.repository;

import com.example.redes.entity.Materia;
import com.example.redes.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MateriaRepositoryImpl implements MateriaService {

    @Autowired
    MateriaRepository repository;

    @Override
    public List<Materia> getAllMateria() {
        return (List<Materia>)repository.findAll();
    }

    @Override
    public Materia getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Materia materia) {
        repository.save(materia);
    }

    @Override
    public void deleteMateria(Long id) {
        repository.deleteById(id);
    }
}
