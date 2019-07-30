package com.example.registrationandroid;

public class Animal {
    private int animalID;
    private String animalName;
    private int imageId;

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

}
