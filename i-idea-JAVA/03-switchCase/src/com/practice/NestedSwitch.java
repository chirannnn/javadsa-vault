package com.practice;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dept = in.next();

        switch (empId){
            case 1:
                System.out.println("Torvalds");
                break;
            case 2:
                System.out.println("Linus");
                break;
            case 3:
                System.out.println("Emp num 3");
                switch (dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("CSE department");
                        break;
                    default:
                        System.out.println("Enter a proper department");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
        }

        // better way to write

        switch (empId) {
            case 1 -> System.out.println("Torvalds");
            case 2 -> System.out.println("Linus");
            case 3 -> {
                System.out.println("Emp num 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT department");
                    case "CSE" -> System.out.println("CSE department");
                    default -> System.out.println("Enter a proper department");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}


