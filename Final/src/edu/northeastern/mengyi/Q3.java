package edu.northeastern.mengyi;

//Given a string s of '(' , ')' and lowercase English characters.
//
//Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions )
// so that the resulting parentheses string is valid and return any valid string.
//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
//Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.

public class Q3 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
                res.append(c);
            } else if (c == ')') {
                if (left > 0) {
                    res.append(c);
                    left--;
                }
            } else {
                res.append(c);
            }
        }
        for (int i = res.length() - 1; i >= 0; i--) {
            if (left == 0) {
                break;
            }
            if (res.charAt(i) == '(') {
                res.deleteCharAt(i);
                left--;
            }
        }
        return res.toString();
    }
}
//Time complexity is O(n)
//Space complexity is O(n)
