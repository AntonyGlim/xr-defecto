package ru.asterra.xrdefecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.asterra.xrdefecto.entities.XRayMachine;
import ru.asterra.xrdefecto.repositories.XRayMachineRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class XRayMachineService {

    XRayMachineRepository xRayMachineRepository;

    @Autowired
    public void setxRayMachineRepository(XRayMachineRepository xRayMachineRepository) {
        this.xRayMachineRepository = xRayMachineRepository;
    }

    public XRayMachine findOneByTitle(String title) {
        return xRayMachineRepository.findOneByTitle(title);
    }

    public List<XRayMachine> findAll(){
        List<XRayMachine> xRayMachines = new ArrayList<>();
        xRayMachineRepository.findAll().forEach(xRayMachines::add);
        return xRayMachines;
    }
}