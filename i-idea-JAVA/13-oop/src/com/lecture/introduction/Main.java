package com.lecture.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student chiran;
//        chiran = new Student();

//        chiran.rno = 5;
//        chiran.name = "Chiranjeevi D";
//        chiran.marks = 34.99f;

        Student chiran = new Student(1, "Chirrrrnnn", 10.0f);

//        chiran.changeName("Kalai");
//        chiran.greeting();

        System.out.println(chiran.rno);
        System.out.println(chiran.name);
        System.out.println(chiran.marks);

        Student random = new Student(chiran);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Maid";
        System.out.println(two.name);
    }
}

class Student {
    int rno;
    String name;
    float marks = 95.0f;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting () {
        System.out.println("Hello My name is " + this.name);
    }

    void changeName (String name) {
        this.name = name;
    }

    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "random student", 45.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
