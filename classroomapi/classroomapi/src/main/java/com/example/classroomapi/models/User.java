package com.example.classroomapi.models;

import com.example.classroomapi.help_package.Type_user;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String username;
    private String password;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Type_user type_user;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Registration> registrations;

    public User() {
    }

    public User(Integer user_id, String username, String password, String email, String phone, Type_user type_user) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.type_user = type_user;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Type_user getType_user() {
        return type_user;
    }

    public void setType_user(Type_user type_user) {
        this.type_user = type_user;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
