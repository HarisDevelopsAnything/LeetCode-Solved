/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> inorder(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        List<Integer> l = inorder(p.left);
        res.addAll(l);
        res.add(p.val);
        List<Integer> r = inorder(p.right);
        res.addAll(r);
        return res;
    }
    List<Integer> preorder(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        res.add(p.val);
        List<Integer> l = preorder(p.left);
        res.addAll(l);
        List<Integer> r = preorder(p.right);
        res.addAll(r);
        return res;
    }
    List<Integer> postorder(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        List<Integer> l = postorder(p.left);
        res.addAll(l);
        List<Integer> r = postorder(p.right);
        res.addAll(r);
        res.add(p.val);
        return res;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return (inorder(p).equals(inorder(q)) && preorder(p).equals(preorder(q)) && postorder(p).equals(postorder(q)));
    }
}