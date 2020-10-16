package HackerRankProblems;

public class ProblemSolving {

    public static void main(String[] args){

        TreeNode n4 = new TreeNode(4,null,null);
        TreeNode n5 = new TreeNode(5,null,null);
        TreeNode n2 = new TreeNode(2,n4,null);
        TreeNode n3 = new TreeNode(3,n5,null);
        TreeNode n1 = new TreeNode(1,n2,n3);

        Solution solution = new Solution();
        solution.findTilt(n1);
        System.out.println(solution.totalTilt);




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
    public int totalTilt;
    public int findTilt(TreeNode root) {
        if(root!=null){
            System.out.println(root.val);
            findTilt(root.left);
            totalTilt += visit(root);
            System.out.println("tilt at" + root.val + " = " + visit(root));
            findTilt(root.right);
        }
        return totalTilt;


    }
    public int visit(TreeNode node){
        int rightVal = node.right==null ? 0:node.right.val;
        int leftVal = node.left==null ? 0:node.left.val;
        return Math.abs(rightVal-leftVal);
    }
}