package org.example.tst24_3;

public class Employee {
    String name;
    String level;
    float workPlan;
    String dateOfJoiningCompany;

    @Override
    public String toString() {
        return "Jmeno: " + name;
    }

    public Employee(String name, String dateOfJoiningCompany, float workPlan, String level) {
        this.name = name;
        this.dateOfJoiningCompany = dateOfJoiningCompany;
        this.workPlan = workPlan;
        this.level = level;
    }
}
