package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        Triangle.Point point1 = new Triangle.Point(2, 10);
        Triangle.Point point2 = new Triangle.Point(7, 15);
        Triangle.Point point3 = new Triangle.Point(5, 3);
        Triangle triangle1 = new Triangle(point1, point2, point3);
        System.out.println("Square of triangle = " + triangle1.getSquareOfTriangle());
        System.out.println("Task 2");
        Man man1 = new Man("Alex", 25, "male", 70);
        Student student1 = new Student("Ann", 30, "female", 50, 2);
        System.out.println(student1);
        student1.changeYear(5);
        System.out.println(student1);
        Student student2 = new Student("Matt", 35, "male", 75, 4);
        Student student3 = new Student("Jessica", 25, "female", 50, 3);
        Student student4 = new Student("Luke", 40, "male", 90, 7);
        Student student5 = new Student("Danny", 20, "male", 60, 1);
        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        try {
            Writer.writeToFile(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
