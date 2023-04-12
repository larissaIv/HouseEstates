package com.example.houseEstates.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "towns")
public class TownEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String town;

    public Long getId() {
        return id;
    }

    public TownEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTown() {
        return town;
    }

    public TownEntity setTown(String town) {
        this.town = town;
        return this;
    }

}
