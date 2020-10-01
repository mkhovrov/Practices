package com.practice_5.workers;

public class Manager {
    public float baseSalary;
    calcSalary(){
        return (baseSalary + (0.05f * Company.getIncome()));
    }
}
