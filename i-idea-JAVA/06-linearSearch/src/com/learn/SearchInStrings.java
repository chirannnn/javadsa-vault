package com.learn;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "chiran";
        char target = 'v';
        System.out.println(searchString(name, target));
    }

    static boolean searchString2(String name, char target){
        if (name.length() == 0) return false;

        for (char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchString(String name, char target){
        if (name.length() == 0) return false;

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
