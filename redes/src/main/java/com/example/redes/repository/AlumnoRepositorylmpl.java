package com.example.redes.repository;

import com.example.redes.entity.Alumno;
import com.example.redes.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AlumnoRepositorylmpl implements AlumnoService {
    @Autowired
    AlumnoRepository repository;

    @Override
    public List<Alumno> getAllAlumno() {
        return (List<Alumno>)repository.findAll();
    }

    @Override
    public Alumno getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Alumno alumno) {
        repository.save(alumno);
    }

    @Override
    public void deleteAlumno(Long id) {
        repository.deleteById(id);
    }

}
