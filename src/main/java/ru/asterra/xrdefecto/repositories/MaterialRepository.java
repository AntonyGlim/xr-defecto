package ru.asterra.xrdefecto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.asterra.xrdefecto.entities.Material;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {
    Material findOneByTitle(String title);
}
