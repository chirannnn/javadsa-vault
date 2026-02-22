package com.lecture.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSeq_02 {
    public static void main(String[] args) {
//        subSeq("", "abc");

//        System.out.println(subSeqRet("", "abc"));
        System.out.println(subSeqRetAscii("", "abc"));
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static List<String> subSeqRet(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> left =  subSeqRet(p + ch, up.substring(1));
        List<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static List<String> subSeqRetAscii(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> left =  subSeqRetAscii(p + ch, up.substring(1));
        List<String> right = subSeqRetAscii(p, up.substring(1));
        List<String> ascii = subSeqRetAscii(p + (ch + 0), up.substring(1));

        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
