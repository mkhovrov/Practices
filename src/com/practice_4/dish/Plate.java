package com.practice_4.dish;

public class Plate extends com.practice_4.dish.Dish {
    public float radius, height;

    public Plate(String material, float mass, String shape, float radius, float height){
        this.material = material;
        this.mass = mass;
        this.shape = shape;
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }

    public String forOutput() {
        return "Plate" + '\n' +
                "   material: " + material + '\n' +
                "   mass: " + mass + '\n' +
                "   shape: " + shape + '\n' +
                "   radius: " + radius + '\n' +
                "   height: " + height + '\n';
    }

}
