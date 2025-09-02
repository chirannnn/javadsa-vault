package com.learn;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {1,345,2,6,7896};

        System.out.println(findNumbers(nums))
        ;
        System.out.println(digits2(-345678));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numOfDigits = digits(num);

//        if(numOfDigits % 2 == 0){
//            return true;
//        }
//        return false;

        return numOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if (num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num) + 1);
    }

    static int digits(int num){
        if (num < 0){
            num = num * 1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
