// Take name as input and print a greeting message for that particular name.

package com.practice;

import java.util.Scanner;

public class Greeting02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = in.next();
        String greetMsg = "Hello " + name + " Welcome!";
        System.out.println(greetMsg);
    }
}