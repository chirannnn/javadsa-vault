// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeNumbersInRange11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Num : ");
        int firstNum = in.nextInt();
        System.out.print("Enter Second Num : ");
        int secondNum = in.nextInt();

        primeCheck(firstNum, secondNum);
    }

    static void primeCheck(int num1, int num2){
        for(int i = num1; i <= num2; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
