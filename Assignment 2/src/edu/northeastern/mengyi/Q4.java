package edu.northeastern.mengyi;
import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList();
        List<List<Integer>> res = new ArrayList();
        if (root == null) return res;
        int sign = 1;
        list.add(root);
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(root.val);
        res.add(ans);
        while (list.size() > 0) {
            int length = list.size();
            for (int i = 0; i < length; i++) {
                TreeNode temp = list.remove(0);
                if (temp != null) {
                    list.add(temp.left);
                    list.add(temp.right);
                }
            }
            if (sign % 2 == 0) {
                ans = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) != null) ans.add(list.get(i).val); //不记录null
                }
            }
            else {
                ans = new ArrayList<>();
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i) != null) ans.add(list.get(i).val);
                }
            }
            if (ans.size() > 0) res.add(ans);
            sign++;
        }
        return res;
    }
}
