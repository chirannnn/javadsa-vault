// LCM Of Two Numbers

package com.practice;

import java.util.Scanner;

public class LCM08 {
    public static void main(String[] args) {
        /*
        Least Common Multiple
        LCM = a * b / HCF(a,b)

        To find HCF
        Highest Common Factor
        n1 = 12 - factors of 12 - 1,2,3,4,6,12
        n2 = 18 - factors of 18 - 1,2,3,6,9,18
        common factors = 1,2,3,6
        largest = 6
        HCF = 6
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = in.nextInt();

        int a = num1;
        int b = num2;

        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int hcf = num1;
        int lcm = (a * b) / hcf;

        System.out.println("HCF is : " + hcf);
        System.out.println("LCM is : " + lcm);
    }
}
