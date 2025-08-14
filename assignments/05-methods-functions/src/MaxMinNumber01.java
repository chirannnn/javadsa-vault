// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMinNumber01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n1 : ");
        int n1 = in.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = in.nextInt();
        System.out.print("Enter n3 : ");
        int n3 = in.nextInt();

        System.out.println("Maximum num is : " + maximum(n1, n2, n3));
        System.out.println("Minimum num is : " + minimum(n1, n2, n3));
    }

    static int maximum(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    static int minimum(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
