package com.example.springcoretraining;

public class Employee {

    private String firstName;
    private String lastName;
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
        System.out.println("Employee : sayYourInfo()");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
