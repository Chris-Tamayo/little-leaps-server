package com.example.server;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(doubleArray(nums)));

    }

    /**
     * Return double of each number in an int array.
     * @param nums an array of ints
     * @return double of each int in an array
     */
    public static int[] doubleArray(int[] nums){
        int doubleInt[] = nums.clone();
        for (int i = 0; i<nums.length; i++){
            doubleInt[i] = nums[i] * 2;
        }
        return doubleInt;
    }
}
