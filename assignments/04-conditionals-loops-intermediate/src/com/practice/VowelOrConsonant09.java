// Java Program Vowel Or Consonant (string & char handling)

package com.practice;

import java.util.Scanner;

public class VowelOrConsonant09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        char ch = in.next().toLowerCase().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a Vowel");
            }else {
                System.out.println(ch + " is a consonant");
            }
        }else {
            System.out.println("Not an alphabet!");
        }

    }
}
