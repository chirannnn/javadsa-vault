package com.lecture.intro;

public class NumbersExampleRecursion_03 {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n) {
        // base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }

        // body
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }

    static void print2(int n) {
        // base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }

        // body
        System.out.println(n);

        print2(n + 1);

        // runs after the recursive call returns
        // shows how each stack frame resumes execution
        // this is NOT tail recursion anymore
        System.out.println(n);
    }
}
