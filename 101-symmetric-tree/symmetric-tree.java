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
    List<Integer> inorderleft(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        List<Integer> l = inorderleft(p.left);
        res.addAll(l);
        res.add(p.val);
        List<Integer> r = inorderleft(p.right);
        res.addAll(r);
        return res;
    }
    List<Integer> inorderright(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        List<Integer> l = inorderright(p.right);
        res.addAll(l);
        res.add(p.val);
        List<Integer> r = inorderright(p.left);
        res.addAll(r);
        return res;
    }
    List<Integer> preorderleft(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        res.add(p.val);
        List<Integer> l = preorderleft(p.left);
        res.addAll(l);
        List<Integer> r = preorderleft(p.right);
        res.addAll(r);
        return res;
    }
    List<Integer> preorderright(TreeNode p){
        List<Integer> res = new ArrayList<>();
        if(p==null){ res.add(-99); return res; }
        res.add(p.val);
        List<Integer> l = preorderright(p.right);
        res.addAll(l);
        List<Integer> r = preorderright(p.left);
        res.addAll(r);
        return res;
    }
    public boolean isSymmetric(TreeNode root) {
        return (inorderright(root).equals(inorderleft(root)) && preorderleft(root).equals(preorderright(root)));
    }
}