package edu.northeastern.mengyi;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> letterCombinations (String digits) {
        if (digits == null || digits.length() == 0)
            return list;
        String[] numString = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backTracking (digits, numString, 0);
        return list;
    }
    void backTracking (String digits, String[] numString, int num) {
        if (num == digits.length()) {
            list.add (sb.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            backTracking(digits, numString, num + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
