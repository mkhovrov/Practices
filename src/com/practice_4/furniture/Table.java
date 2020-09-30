package com.practice_4.furniture;

public class Table extends Furniture{

    //конструктор
    public Table (float mass, String material, String filler,
                 float width, float lenght, float height, int numberOfShelves){
        this.mass = mass;
        this.material = material;
        this.width = width;
        this.lenght = lenght;
        this.height = height;
        this.numberOfShelves = numberOfShelves;
    }

    public String forOutput() {
        return "Sofa" + '\n' +
                "mass=" + mass + '\n' +
                "   material='" + material + '\n' +
                "   width=" + width + '\n' +
                "   lenght=" + lenght + '\n' +
                "   height=" + height + '\n' +
                "   numberOfShelves=" + numberOfShelves;
    }
}
