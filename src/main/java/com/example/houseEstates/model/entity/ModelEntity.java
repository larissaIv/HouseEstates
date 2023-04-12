package com.example.houseEstates.model.entity;

import com.example.houseEstates.model.enums.CategoryEnum;
import com.example.houseEstates.model.enums.ConstructionEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "models")
public class ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

    @OneToOne
    @JoinColumn(name = "town_id")
    private TownEntity town;

    @Enumerated(EnumType.STRING)
    private ConstructionEnum construction;

    public Long getId() {
        return id;
    }

    public ModelEntity setId(Long id) {
        this.id = id;
        return this;
    }

}
