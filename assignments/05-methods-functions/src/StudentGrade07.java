/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */

import java.util.Scanner;

public class StudentGrade07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Mark : ");
        int mark = in.nextInt();

        grade(mark);
    }

    static void grade(int mark){

        if (mark >=91 && mark <= 100){
            System.out.println("Grade : AA");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("Grade : AB");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("Grade : BB");
        }else if (mark >= 61 && mark <= 70) {
            System.out.println("Grade : BC");
        }else if (mark >= 51 && mark <= 60) {
            System.out.println("Grade : CD");
        }else if (mark >= 41 && mark <= 50) {
            System.out.println("Grade : DD");
        }else if (mark <= 40 && mark >= 0) {
            System.out.println("Grade : Fail");
        }else {
            System.out.println("Enter a valid number (0 to 100)");
        }
    }
}
