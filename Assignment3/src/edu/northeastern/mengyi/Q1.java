package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        back(candidates,list,target,0);
        return res;
    }
    void back(int [] candidates,List<Integer> list,int target,int index){
        if(0==target){
            res.add(new ArrayList<>(list));
            return;
        }
        if(index==candidates.length||target<0){
            return;
        }
        back(candidates,list,target,index+1);
        if(target>0){
            list.add(candidates[index]);
            back(candidates,list,target-candidates[index],index);
            list.remove(list.size()-1);
        }
    }
}
