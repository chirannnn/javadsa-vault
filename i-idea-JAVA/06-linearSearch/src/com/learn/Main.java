package com.learn;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;

//        int ans = linearSearch2(nums, target);
//        System.out.println(ans);

        System.out.println(linearSearch3(nums, target));

    }

    // search the target and return true or false
    static boolean linearSearch3(int[] nums, int target){
        if(nums.length == 0){
            return false;
        }

        for (int element : nums){
            if(element == target){
                return true;
            }
        }
        return false;
    }


    // search the target and return the element
    static int linearSearch2(int[] nums, int target){
        if(nums.length == 0) return -1;

        for (int element : nums){
            if (element == target){
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] nums, int target){
        if(nums.length == 0) return -1;

        for (int index = 0; index < nums.length; index++) {
            // check for element at every index if it is = target
            int element = nums[index];
            if (element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
