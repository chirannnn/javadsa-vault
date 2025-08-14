// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class VotingEligibility03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = in.nextInt();

        eligibility(age);
    }

    static void eligibility(int age){
        if(age >= 18){
            System.out.println("You're eligible to Vote");
        }else {
            System.out.println("You're not eligible to vote");
        }
    }
}
