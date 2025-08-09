package com.practice;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varArgs(1,2,3,4,5,6,7,8,9,0);

        demo("Sathish", "Purusoth", "Mani");

        multiple(1,2,"abc","def");

        fun();
    }

    static  void varArgs(int ...n){
        System.out.println(Arrays.toString(n));
    }

    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static  void multiple(int a, int b, String ...v){
        System.out.println("a = " + a + ", b = " + b + ", v = " + Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
