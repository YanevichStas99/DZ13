package com.company;

public class Student extends Man {
    private int year;

    public Student(String name, int age, String maleOrFemale, int mass, int year) {
        super(name, age, maleOrFemale, mass);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                '}';
    }
    public void changeYear(int year){
        this.year=this.year+year;
    }

}
