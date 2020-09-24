package com.practice_4.dog;

public class JackRusselTerrier extends Dog{
    public String huntGoal;

    //конструктор
    public JackRusselTerrier(float mass, float size, int age, String typeOfFur, String huntGoal) {
        this.mass = mass;
        this.size = size;
        this.age = age;
        this.typeOfHFur = typeOfFur;
        this.huntGoal = huntGoal;
    }

    public void setHuntGoal(String huntGoal) {
        this.huntGoal = huntGoal;
    }
    public String getHuntGoal() {
        return huntGoal;
    }


    public String displayInfo() {
        return "JackRusselTerrier" + '\n' +
                "   mass=" + mass + '\n' +
                "   size=" + size + '\n' +
                "   age=" + age + '\n' +
                "   typeOfHFur=" + typeOfHFur + '\n' +
                "   huntGoal=" + huntGoal + '\n';
    }
}
