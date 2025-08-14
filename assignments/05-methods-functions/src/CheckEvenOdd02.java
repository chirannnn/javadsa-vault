// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class CheckEvenOdd02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        check(num);
    }

    static void check(int n){
        if(n % 2 == 0){
            System.out.println(n + " is Even");
        }else {
            System.out.println(n + " is Odd");
        }
    }
}
