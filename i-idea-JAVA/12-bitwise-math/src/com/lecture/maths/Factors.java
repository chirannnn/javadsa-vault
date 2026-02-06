package com.lecture.maths;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        factors1(36);
        factors2(36);
        factors3(36);
    }

    // O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
        System.out.println();
    }

    // both time and space with be O(sqrt(n))
    static void factors3(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
