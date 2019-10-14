package ru.asterra.xrdefecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.asterra.xrdefecto.entities.Material;
import ru.asterra.xrdefecto.repositories.MaterialRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialService {

    MaterialRepository materialRepository;

    @Autowired
    public void setMaterialRepository(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public Material findOneByTitle(String title) {
        return materialRepository.findOneByTitle(title);
    }

    public List<Material> findAll(){
        List<Material> materials = new ArrayList<>();
        materialRepository.findAll().forEach(materials::add);
        return materials;
    }
}
