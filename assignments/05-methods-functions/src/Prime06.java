// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Prime06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = in.nextInt();

        boolean prime = primeCheck(n);
        if (prime){
            System.out.println(n + " is prime");
        }else{
            System.out.println(n + " is not prime");
        }
    }

    static boolean primeCheck(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
