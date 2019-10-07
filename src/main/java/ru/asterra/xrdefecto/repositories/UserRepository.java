package ru.asterra.xrdefecto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.asterra.xrdefecto.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByEmail(String email);
}
