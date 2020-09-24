package com.practice_2;

public class Dog {

    public String name;
    public int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog()
    {}

    public int ageAsHuman()
    {
        return age * 7;
    }

    public String toStringDog() {
        String s = "Кличка: " + name + "\n" + "Возраст: " + age;
        return s;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
