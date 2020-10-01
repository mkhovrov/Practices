package com.practice_5.workers;
import java.lang.Math;

public class Company {
    public double income;

    public void setIncome(){
        income = 115000d + (int) (Math.random() * 140000);
    }

    public void hire(){

    }

    public void hireAll(){

    }

    public void fire(){

    }
    public double getIncome() {
        return income;
    }
}
