package com.practice_4.dog;

public class Poodle extends Dog {
    public String purpose;

    //конструктор
    public Poodle(float mass, float size, int age, String typeOfFur, String goal) {
        this.mass = mass;
        this.size = size;
        this.age = age;
        this.typeOfHFur = typeOfFur;
        this.purpose = goal;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public String displayInfo() {
        return "Poodle" + '\n' +
                "   mass=" + mass + '\n' +
                "   size=" + size + '\n' +
                "   age=" + age + '\n' +
                "   typeOfHFur=" + typeOfHFur + '\n' +
                "   purpose=" + purpose + '\n';
    }
}
