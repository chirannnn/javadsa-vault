// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class PythagoreanTriplet10 {
    public static void main(String[] args) {
        // a2 + b2 = c2

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int n1 = in.nextInt();
        System.out.print("Enter Num2 : ");
        int n2 = in.nextInt();
        System.out.print("Enter Num3 : ");
        int n3 = in.nextInt();
        if (triplet(n1, n2, n3)){
            System.out.println("Its is a pythagorean Triplet");
        }else {
            System.out.println("Its is NOT a pythagorean Triplet");
        }
    }

    static  boolean triplet(int n1, int n2, int n3){
        int a = n1 * n1;
        int b = n2 * n2;
        int c = n3 * n3;

        return (a + b == c) || (a + c == b) || (b + c == a);
    }
}
