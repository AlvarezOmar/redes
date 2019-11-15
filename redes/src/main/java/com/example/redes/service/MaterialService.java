package com.example.redes.service;

import com.example.redes.entity.Material;

import java.util.List;

public interface MaterialService {
    public List<Material> getAllMaterial();

    public Material getById (Long id);

    public void saveOrUpdate (Material material);

    public void deleteMaterial(Long id);
}
