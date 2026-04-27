package com.lecture.generics_09.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student malar = new Student(8, 92.05f);
        Student kalai = new Student(12, 99.10f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {malar, kalai, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int) (o1.rollno - o2.rollno);
//            }
//        });


        Arrays.sort(list, (o1, o2) -> -(int) (o1.rollno - o2.rollno));

        System.out.println(Arrays.toString(list));

//        if (malar.compareTo(kalai) < 0) {
//            System.out.println(malar.compareTo(kalai));
//            System.out.println("Kalai has more marks");
//        }
    }
}
