package com.practice;

import java.util.Scanner;

public class StringExample04 {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static  String greet(){
        String greeting = "Hey, Whats up!!";
        return  greeting;
    }
}
