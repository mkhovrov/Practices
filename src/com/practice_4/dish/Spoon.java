package com.practice_4.dish;

public class Spoon extends com.practice_4.dish.Dish {
    public float capacity, area, lenght;

    public Spoon(String material, float mass, String shape, float capacity, float area, float lenght) {
        this.material = material;
        this.mass = mass;
        this.shape = shape;
        this.capacity = capacity;
        this.area = area;
        this.lenght = lenght;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public float getArea() {
        return area;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
    public float getCapacity() {
        return capacity;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }
    public float getLenght() {
        return lenght;
    }

    public String forOutput() {
        return "Spoon" + '\n' +
                "   material: " + material + '\n' +
                "   mass: " + mass + '\n' +
                "   shape: " + shape + '\n' +
                "   capacity: " + capacity + '\n' +
                "   area: " + area + '\n' +
                "   lenght: " + lenght + '\n';
    }
}
