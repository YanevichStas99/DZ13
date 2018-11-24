package com.company;

public class Man {
    private String name;
    private int age;
    private String maleOrFemale;
    private int mass;

    public Man(String name, int age, String maleOrFemale, int mass) {
        this.name = name;
        this.age = age;
        this.maleOrFemale = maleOrFemale;
        this.mass = mass;
    }

    public Man(String name, int age, int mass) {
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    public Man() {
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

    public String getMaleOrFemale() {
        return maleOrFemale;
    }

    public void setMaleOrFemale(String maleOrFemale) {
        this.maleOrFemale = maleOrFemale;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maleOrFemale='" + maleOrFemale + '\'' +
                ", mass=" + mass +
                '}';
    }
}
