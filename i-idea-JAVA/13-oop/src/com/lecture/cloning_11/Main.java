package com.lecture.cloning_11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human chiran = new Human(22, "Chirannn");
//        Human twin = new Human(chiran);

        Human twin = (Human) chiran.clone();
        System.out.println(twin.name + " " + twin.age);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(chiran.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
