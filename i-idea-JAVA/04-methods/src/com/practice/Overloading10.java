package com.practice;

public class Overloading10 {
    public static void main(String[] args) {
//        fun(2);
//        fun("Kalai");

        int ans = sum(1,2,3);
        System.out.println(ans);
    }

    static int sum(int a,int b){
        return a + b;
    }

    static int sum(int a,int b,int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
