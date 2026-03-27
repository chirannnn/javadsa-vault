package com.lecture.properties_05.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(1.3, 6.5, 7.2);

        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(4, 5, 6, 7);
//        System.out.println(box3.h + " " + box3.weight);
//        System.out.println(box4.h + " " + box4.weight);


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box5 = new Box(2, 4, 5);
//        System.out.println(box5);

        Box box6 = new BoxWeight();
        System.out.println(box6.l);
    }
}
