package edu.northeastern.mengyi;

//Given an array, rotate the array to the right by k steps, where k is non-negative.

public class Q1 {
    public void rotate(int nums[], int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //put the original nums to the temp
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //move to the right within k
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
    }
}
