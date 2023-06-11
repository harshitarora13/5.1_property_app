package com.example.propertyapp;

import android.content.Context;

public class Property {
    private String images, address, rent, bedrooms, carparks, bathrooms;

    public Property (String images, String address, String rent, String bedrooms, String carparks, String bathrooms){

        this.images = images;
        this.address= address;
        this.rent = rent;
        this.bedrooms = bedrooms;
        this.carparks = carparks;
        this.bathrooms = bathrooms;


    }


    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getCarparks() {
        return carparks;
    }

    public void setCarparks(String carparks) {
        this.carparks = carparks;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }


}
