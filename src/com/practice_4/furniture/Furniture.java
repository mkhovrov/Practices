package com.practice_4.furniture;

public abstract class Furniture {
    public float lenght, width, height, mass;
    public String material;
    public int numberOfShelves;

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }
    public float getLenght() {
        return lenght;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
    public float getMass() {
        return mass;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }
    public int getNumberOfShelves() {
        return numberOfShelves;
    }
}
