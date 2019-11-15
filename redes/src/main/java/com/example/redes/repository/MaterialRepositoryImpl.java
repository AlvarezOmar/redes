package com.example.redes.repository;

import com.example.redes.entity.Material;
import com.example.redes.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MaterialRepositoryImpl implements MaterialService {
    @Autowired
    MaterialRepository repository;

    @Override
    public List<Material> getAllMaterial() {
        return (List<Material>)repository.findAll();
    }

    @Override
    public Material getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Material material) {
        repository.save(material);
    }

    @Override
    public void deleteMaterial(Long id) {
        repository.deleteById(id);
    }
}
