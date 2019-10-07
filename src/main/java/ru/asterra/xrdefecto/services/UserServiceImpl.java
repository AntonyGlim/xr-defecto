package ru.asterra.xrdefecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.asterra.xrdefecto.entities.Role;
import ru.asterra.xrdefecto.entities.User;
import ru.asterra.xrdefecto.repositories.RoleRepository;
import ru.asterra.xrdefecto.repositories.UserRepository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Autowired
    public void setPasswordEncoder(BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public User findByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    /**Связь нашего пользователя с пользователем Spring*/
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findOneByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

//    @Override
//    @org.springframework.transaction.annotation.Transactional
//    public User save(SystemUser systemUser) {
//        User user = new User();
//        if (findByUsername(systemUser.getUsername()) != null) {
//            throw new RuntimeException("User with username " + systemUser.getUsername() + " is already exist");
//        }
//        user.setUsername(systemUser.getUsername());
//        user.setPassword(passwordEncoder.encode(systemUser.getPassword()));
//        user.setFirstName(systemUser.getFirstName());
//        user.setLastName(systemUser.getLastName());
//        user.setEmail(systemUser.getEmail());
//        user.setPhone(systemUser.getPhone());
//        user.setRoles(Arrays.asList(roleRepository.findOneByName("ROLE_CUSTOMER")));
//        return userRepository.save(user);
//    }
}
