package com.practice_4.dish;

public class Fork extends com.practice_4.dish.Dish {
    public int numberOfTines;
    float lenght;

    public Fork(String material, float mass, String shape, int numberOfTines, float lenght){
        this.material = material;
        this.mass = mass;
        this.shape = shape;
        this.numberOfTines = numberOfTines;
        this.lenght = lenght;
    }

    public void setNumberOfTines(int numberOfTines) {
        this.numberOfTines = numberOfTines;
    }
    public int getNumberOfTines() {
        return numberOfTines;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public float getLenght() {
        return lenght;
    }

    public String forOutput() {
        return "Fork" + '\n' +
                "   material: " + material + '\n' +
                "   mass: " + mass + '\n' +
                "   shape: " + shape + '\n' +
                "   numberOfTines: " + numberOfTines + '\n' +
                "   lenght: " + lenght + '\n';
    }
}
