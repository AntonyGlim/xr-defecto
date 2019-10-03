package ru.asterra.xrdefecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.asterra.xrdefecto.entities.XRayMachine;
import ru.asterra.xrdefecto.repositories.XRayMachineRepository;

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
}
