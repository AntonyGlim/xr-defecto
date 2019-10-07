package ru.asterra.xrdefecto.services;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.asterra.xrdefecto.entities.User;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
}
