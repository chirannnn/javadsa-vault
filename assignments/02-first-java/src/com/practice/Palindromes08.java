// To find out whether the given String is Palindrome or not.
/*
    Examples of palindrome
        Words = madam, racecar, level, moon
        Numbers = 121, 12321
 */
package com.practice;

import java.util.Scanner;

public class Palindromes08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = in.next().toLowerCase();
        String reversed = "";

        for(int i = word.length()-1; i >= 0 ; i--){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        }else {
            System.out.println(word + " is not a palindrome");
        }

    }
}
