// Reverse A String In Java

package com.practice;

import java.util.Scanner;

public class ReverseString06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String Str = in.next();
        String Rev = "";

        for (int i = Str.length() - 1; i >= 0; i--){
            Rev += Str.charAt(i);
        }

        System.out.println("Original Str : " + Str);
        System.out.println("Reversed Str : " + Rev);

//        String Reverse = new StringBuilder(Str).reverse().toString();
//        System.out.println("Using string builder : " + Reverse);
    }
}
