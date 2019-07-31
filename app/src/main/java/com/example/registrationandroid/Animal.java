package com.example.registrationandroid;

import java.net.URL;

public class Animal {
    private int animalID;
    private String animalName;
    private int imageId;
    private String decsription;
    private URL showData;

    public Animal(int animalID, String animalName, int imageId, String decsription, URL showData) {
        this.animalID = animalID;
        this.animalName = animalName;
        this.imageId = imageId;
        this.decsription = decsription;
        this.showData = showData;
    }

    public Animal(int animalID, String animalName, int imageId) {
        this.animalID = animalID;
        this.animalName = animalName;
        this.imageId = imageId;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public URL getShowData() {
        return showData;
    }

    public void setShowData(URL showData) {
        this.showData = showData;
    }
}
