package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q6 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return result;
        }
        backtracking(nums, 0);
        return result;
    }
    private void backtracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path));
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
