package org.example;

import java.util.List;

public class Worker {
    private String name;
    private int age;
    private float salary;
    private boolean isFullTime;
    private char gender;
    private List<Project> projects;

    // Constructors
    public Worker() {}

    public Worker(String name, int age, float salary, boolean isFullTime, char gender, List<Project> projects) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.gender = gender;
        this.projects = projects;
    }

    // Getters and Setters
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
