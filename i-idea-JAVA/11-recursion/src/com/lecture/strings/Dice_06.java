package com.lecture.strings;

import java.util.ArrayList;
import java.util.List;

public class Dice_06 {
    public static void main(String[] args) {
//        dice("", 4);

//        System.out.println(diceRet("", 4));

//        diceFace("", 4 ,3);

        System.out.println(diceFaceRet("", 3 ,6));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> diceRet(String p, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceRet(p + i, target - i));
        }
        return ans;
    }

    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    static List<String> diceFaceRet(String p, int target, int face) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(diceFaceRet(p + i, target - i, face));
        }
        return ans;
    }
}
