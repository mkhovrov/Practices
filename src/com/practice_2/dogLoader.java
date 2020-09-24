package com.practice_2;

public class dogLoader
{
    public static void main(String[] args)
    {
        Dog a[] = new Dog[3];

        a[0] = new Dog();
        a[0].setAge(2);
        a[0].setName("Шарик");

        a[1] = new Dog();
        a[1].setAge(12);
        a[1].setName("Кубик");

        a[2] = new Dog();
        a[2].setAge(7);
        a[2].setName("Тетраэдрик");

        for (int i = 0; i < 3; i++)
        {
            System.out.println(a[i].toStringDog());
            System.out.println("Человеческий возраст собаки: " + a[i].ageAsHuman());
            System.out.println();
        }
    }
}
