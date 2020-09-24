package com.practice_4.dish;

public abstract class Dish {
    public float mass;
    public String shape, material;

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

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getShape() {
        return shape;
    }

    public void displayInfo() {
        System.out.println();
    }

}
