package com.example.houseEstates.model.entity;

import com.example.houseEstates.model.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public UserRoleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleEnum userRole;

    public RoleEnum getUserRole() {
        return userRole;
    }

    public UserRoleEntity setUserRole(RoleEnum userRole) {
        this.userRole = userRole;
        return this;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", userRole=" + userRole +
                '}';
    }
}
