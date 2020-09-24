package com.practice_4.furniture;

public class Sofa extends Furniture{
    public String filler;

    //конструктор
    public Sofa (float mass, String material, String filler,
                 float width, float lenght, float height, int numberOfShelves){
        this.mass = mass;
        this.material = material;
        this.filler = filler;
        this.width = width;
        this.lenght = lenght;
        this.height = height;
        this.numberOfShelves = numberOfShelves;
    }




    public void setFiller(String filler) {
        this.filler = filler;
    }
    public String getFiller() {
        return filler;
    }

    public String forOutput() {
        return "Sofa" + '\n' +
                "mass=" + mass + '\n' +
                "   material='" + material + '\n' +
                "   filler='" + filler + '\n' +
                "   width=" + width + '\n' +
                "   lenght=" + lenght + '\n' +
                "   height=" + height + '\n' +
                "   numberOfShelves=" + numberOfShelves;
    }
}
