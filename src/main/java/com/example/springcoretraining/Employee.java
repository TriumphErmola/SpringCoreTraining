package com.example.springcoretraining;

public class Employee {

    private String name;
    private String age;

    private Welder welder;
    private Adjuster adjuster;

    public Employee(Welder welder) {
        this.welder = welder;
    }

    public void setWelder(Welder welder) {
        System.out.println("Setter Welder");
        this.welder = welder;
    }

    public Employee() {
    }

    public void sayYourInfo() {
        System.out.println("Employee :Я не умею создавать нормальные методы. увы");
    }


}
