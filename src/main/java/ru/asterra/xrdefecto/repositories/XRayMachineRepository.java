package ru.asterra.xrdefecto.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.asterra.xrdefecto.entities.XRayMachine;

import java.util.List;

public interface XRayMachineRepository extends CrudRepository<XRayMachine, Long> {

    XRayMachine findOneByTitle(String title);

}
