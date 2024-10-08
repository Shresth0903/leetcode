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
    public int kthSmallest(TreeNode root, int k) {
        preorder(root, k);
        return ans;
    }
    int i=0;
    int ans=0;
    public void preorder(TreeNode node, int k){
        if(node==null){
            return;
        }
        preorder(node.left, k);
        i++;
        if(i==k){
            ans=node.val;
            return;
        }
        preorder(node.right, k);
    }
}