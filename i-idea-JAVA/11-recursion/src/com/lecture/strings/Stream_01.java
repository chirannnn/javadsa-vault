package com.lecture.strings;

public class Stream_01 {
    public static void main(String[] args) {
        String str = "bcaadchabapple";
        String s = "bcadappcapple";
        skip("", str);

        System.out.println(skip(str));

        System.out.println(skipApple(str));

        System.out.println(skipAppNotApple(s));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
