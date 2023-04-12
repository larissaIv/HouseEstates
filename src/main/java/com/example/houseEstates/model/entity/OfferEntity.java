package com.example.houseEstates.model.entity;


import com.example.houseEstates.model.enums.CategoryEnum;
import com.example.houseEstates.model.enums.ConstructionEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String imageUrl;
    private BigDecimal price;
    private int squareFeet;
    private int rooms;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryEnum category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ConstructionEnum construction;

    @ManyToOne
    private TownEntity town;

    @ManyToOne
    private UserEntity seller;

    public TownEntity getTown() {
        return town;
    }

    public OfferEntity setTown(TownEntity town) {
        this.town = town;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public void setSeller(UserEntity seller) {
        this.seller = seller;
    }

    public Long getId() {
        return id;
    }

    public OfferEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public OfferEntity setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public ConstructionEnum getConstruction() {
        return construction;
    }

    public OfferEntity setConstruction(ConstructionEnum construction) {
        this.construction = construction;
        return this;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public OfferEntity setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
        return this;
    }

    public int getRooms() {
        return rooms;
    }

    public OfferEntity setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    @Override
    public String toString() {
        return "OfferEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                ", squareFeet=" + squareFeet +
                ", rooms=" + rooms +
                ", category=" + category +
                ", construction=" + construction +
                ", town=" + town +
                ", seller=" + seller +
                '}';
    }
}
