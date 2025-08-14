// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        int nNN = naturalNum(n);
        System.out.println("Sum of first " + n + " natural numbers = " + nNN);
    }

    static int naturalNum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
