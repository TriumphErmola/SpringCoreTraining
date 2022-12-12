package com.example.springcoretraining;

public class Adjuster extends Employee {

    public Adjuster() {
        System.out.println("Констуктор - Монтажник");
    }

    @Override
    public void sayYourInfo() {
        System.out.println("Монтажник : Я не умею создавать нормальные методы. увы");
    }
}
