package com.example.redes.repository;

import com.example.redes.entity.Docente;
import com.example.redes.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DocenteRepositoryImpl implements DocenteService {

    @Autowired
    DocenteRepository repository;

    @Override
    public List<Docente> getAllDocente() {
        return (List<Docente>)repository.findAll();
    }

    @Override
    public Docente getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Docente docente) {
        repository.save(docente);
    }

    @Override
    public void deleteDocente(Long id) {
        repository.deleteById(id);
    }
}
