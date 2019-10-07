package ru.asterra.xrdefecto.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @OneToMany(mappedBy = "user")
//    private List<Order> orders;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

    public User(String email, String password, String first_name, String last_name) {
        this.email = email;
        this.password = password;
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public User(String email, String password, String first_name, String last_name, Collection<Role> roles) {
        this.email = email;
        this.password = password;
        this.firstName = first_name;
        this.lastName = last_name;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
//                ", orders=" + orders +
                ", roles=" + roles +
                '}';
    }
}
