package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q8 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        Map<Integer, List<Integer>> result = new HashMap();
        getLeaves(root,result);
        return new ArrayList(result.values());
    }
    private int getLeaves(TreeNode root,Map<Integer,List<Integer>> result){
        if(root == null) return -1;
        int left = getLeaves(root.left, result);
        int right = getLeaves(root.right, result);
        if(root.left == null && root.right == null){
            addToResult(result,0,root.val);
            return 1;
        }else{
            int maxHeight = Math.max(left,right);
            addToResult(result, maxHeight,root.val);
            return maxHeight + 1;
        }
    }
    private void addToResult(Map<Integer,List<Integer>> result, int index, int value){
        List<Integer> list = result.get(index);
        if(list == null){
            list = new ArrayList();
            result.put(index,list);
        }
        list.add(value);
    }
}
