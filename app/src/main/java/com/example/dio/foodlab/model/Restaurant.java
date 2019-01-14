package com.example.dio.foodlab.model;

import com.example.dio.foodlab.entity.RestaurantEntity;

/**
 * Created by mircea on 10/26/2016.
 */

public class Restaurant {
    private String id;
    private String name;
    private String location;
    private int stars;

    public Restaurant(){

    }

    public Restaurant(String id, String name, String location, int stars){
        this.id = id;
        this.name = name;
        this.location = location;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public RestaurantEntity getEntity() {
        RestaurantEntity entity = new RestaurantEntity();
        entity.setUniqueIdentifier(this.getId());
        entity.setName(this.getName());
        entity.setLocation(this.getLocation());
        entity.setStars(this.getStars());
        return entity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
