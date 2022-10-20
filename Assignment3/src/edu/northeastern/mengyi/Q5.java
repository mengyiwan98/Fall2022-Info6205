package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q5 {
    List<Integer> res = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        LinkedList<Integer> path = new LinkedList<>();
        backtracing(path, n, k, 0, 0);
        int[] ret = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            ret[i] = res.get(i);
        }
        return ret;
    }
    public void backtracing(LinkedList<Integer> path ,int n, int k, int index, int preVale) {
        if(index == n) {
            int num = 0;
            for(int i = 0; i < path.size(); i++) {
                num = num * 10 + path.get(i);
            }
            res.add(num);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if(index == 0 && i == 0) {
                continue;
            }
            if(index != 0 && Math.abs(preVale - i) != k) {
                continue;
            }
            path.add(i);
            backtracing(path, n, k, index + 1, i);
            path.removeLast();
        }
    }
}
