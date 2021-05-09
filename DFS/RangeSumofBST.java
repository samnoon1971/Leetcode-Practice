public class RangeSumofBST {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.rangeSumBST(null, 1, 100);
    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) {
            return 0;
        }
        if(root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
