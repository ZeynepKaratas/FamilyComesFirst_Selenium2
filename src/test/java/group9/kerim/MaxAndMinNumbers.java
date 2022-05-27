package group9.kerim;

import java.util.Arrays;

public class MaxAndMinNumbers {
    /*
    Array - Find Maximum
    Write a method that can find the maximum number from an int Array
     */

        public static int maximumNumber(int[] nums){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }

        public static int minNumber(int[] nums){
            Arrays.sort(nums);
            return nums[0];
        }

        public static void main(String[] args) {

            int [] num = {-5,-3,1,3,5,8,6};
            System.out.println(maximumNumber(num));
            System.out.println(minNumber(num));

        }
    }



