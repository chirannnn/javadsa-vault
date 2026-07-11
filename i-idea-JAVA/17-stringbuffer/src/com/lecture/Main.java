package com.lecture;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Chirannnnnnnn");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("WeLearnDSA");
        sb.append(" is nice!");

        // sb.insert(2, " Rahul ");

        sb.replace(1, 5, "Chiraaaa");

        sb.delete(1, 5);

        // sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String random = RandomString.generate(n);
        System.out.println(random);

        // remove whitespaces

        String sentence = "Hi h   hjh  hjkso  siowi     w ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // split

        String arr = "Kunal,Apoorv,Rahul,Snehal";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat dc = new DecimalFormat("00.0000");
        System.out.println(dc.format(69.69));
    }
}
