package com.example.pp_3_1_1_springboot.model;



import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Length(min = 2, max = 32, message = "Invalid name. Size should be between 2 to 32.")
    @Pattern(regexp="[\\p{L}]+", message = "Invalid name. You can use only letters.")
    private String name;


    @Length(min = 2, max = 32, message = "Invalid last name. Size should be between 2 to 32.")
    @Pattern(regexp="[\\p{L}]+", message = "Invalid last name. You can use only letters.")
    private String lastName;
    @NotEmpty(message = "Invalid email address. Please enter your email address.")
    @Email(message = "Invalid email address. Please enter a proper email ID.")
    private String email;

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
