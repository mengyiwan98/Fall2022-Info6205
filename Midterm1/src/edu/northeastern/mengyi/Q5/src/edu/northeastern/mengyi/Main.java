package edu.northeastern.mengyi;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 12, 17]
    private static int[] getStartOfEachValues(int[] arr, int[] values) {
        int[] indexes = new int[values.length];
        Map<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[arr.length];
        for (int i = 0; i < values.length; i++) {
            indexes[i] = mp.getOrDefault(values[i], -1);
        }
        for (int i = 0; i < arr.length; i++) {
            mp.putIfAbsent(arr[i], i);
        }
        return indexes;
    }
}
//The time complexity is O(N)