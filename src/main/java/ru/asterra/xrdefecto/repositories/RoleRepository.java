package ru.asterra.xrdefecto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.asterra.xrdefecto.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findOneByName(String name);
}
