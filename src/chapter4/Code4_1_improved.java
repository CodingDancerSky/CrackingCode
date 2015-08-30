package chapter4;

import CtCILibrary.TreeNode;

public class Code4_1_improved {
  public static void main(String[] args){
    int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
    TreeNode root=TreeNode.createMinimalBST(array);
    System.out.println(checkHeight(root));
    System.out.println("Is it balanced?");
    if(isBalanced(root)) System.out.println("Yes!");
    else System.out.println("Nope!");
    
    root.insertInOrder(4);
    System.out.println(checkHeight(root));
    if(isBalanced(root)) System.out.println("Yes!");
    else System.out.println("Nope!");
  }

  static boolean isBalanced(TreeNode root) {
    // TODO Auto-generated method stub
    if(checkHeight(root)==-1) return false;
    else return true;
  }

  static int checkHeight(TreeNode root) {
    // TODO Auto-generated method stub
    if(root==null) return 0;
    
    int leftHight=checkHeight(root.left);
    if(leftHight==-1) return -1;
    
    int rightHight=checkHeight(root.right);
    if(rightHight==-1) return -1;
    
    int heightDiff=Math.abs(checkHeight(root.left)-checkHeight(root.right));
    if(heightDiff>1) return -1;
    else return Math.max(rightHight,leftHight)+1;
  }
}
