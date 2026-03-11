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
        Student chiran;
        chiran = new Student();

//        chiran.rno = 5;
//        chiran.name = "Chiranjeevi D";
//        chiran.marks = 34.99f;

        System.out.println(chiran.rno);
        System.out.println(chiran.name);
        System.out.println(chiran.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks = 95.0f;
}
