package com.example.springcoretraining;

public class Welder extends Employee{

    public Welder() {
        System.out.println("Констуктор - Сварщик");
    }




    @Override
    public void sayYourInfo() {
        System.out.println("Сварщик : Я не умею создавать нормальные методы. увы");
    }
}
