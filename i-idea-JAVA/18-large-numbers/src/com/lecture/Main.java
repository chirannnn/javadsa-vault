package com.lecture;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        BI();
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
//        double ans = y - x;
//        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565352.986785764");

        // operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
    }

    static void BI() {
        int a = 6;
        int b = 9;

        BigInteger B = BigInteger.valueOf(a); // convert int/long to BI
        int c = B.intValue();

        BigInteger C = new BigInteger("2345678654325678976543256789");
        BigInteger X = new BigInteger("4536789765432");

        // constants
        BigInteger CONST = BigInteger.ONE;

        // operations
        BigInteger A = C.add(X);

        BigInteger S = C.subtract(X);

        BigInteger M = C.multiply(X);

        BigInteger D = C.divide(X);

        BigInteger rem = C.remainder(X);

        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }

        System.out.println(Factorial.fact(100));
    }
}
