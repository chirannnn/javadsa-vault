// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        if(palindrome(num)){
            System.out.println(num + " is a palindrome");
        }else{
            System.out.println(num + " is not a palindrome");
        }
    }

    static boolean palindrome(int n){
        int origial = n;
        int sum = 0;
        if (n < 0){
            return false;
        }
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum * 10 + rem;
        }
        return sum == origial;
    }
}
