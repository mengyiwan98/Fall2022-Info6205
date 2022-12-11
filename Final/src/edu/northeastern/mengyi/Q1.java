package edu.northeastern.mengyi;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // string list
        Map<String, List<String>> mp = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = mp.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            // key
            mp.put(key, list);
        }
        return new ArrayList<List<String>>(mp.values());
    }
}

//Time complexity is O(nklogk)
//Space complexity is O(nk)
