package com.practice_4.dog;

public abstract class Dog {
    public float mass, size;
    public int age;
    public String typeOfHFur;


    public void setMass(float mass) {
        this.mass = mass;
    }
    public float getMass() {
        return mass;
    }

    public void setSize(float size) {
        this.size = size;
    }
    public float getSize() {
        return size;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setTypeOfHFur(String typeOfHFur) {
        this.typeOfHFur = typeOfHFur;
    }
    public String getTypeOfHFur() {
        return typeOfHFur;
    }
}
