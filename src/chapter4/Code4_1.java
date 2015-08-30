package chapter4;

import CtCILibrary.TreeNode;

public class Code4_1 {
  public static void main(String[] args){
    int array[]={0,1,3,4};
    TreeNode root=TreeNode.createMinimalBST(array);
    System.out.println(getHeight(root));
    System.out.println("Is it balanced?");
    if(isBalanced(root)) System.out.println("Yes!");
    else System.out.println("Nope!");
    
    root.insertInOrder(4);
    if(isBalanced(root)) System.out.println("Yes!");
    else System.out.println("Nope!");
  }
  
  public static int getHeight(TreeNode root){
    if(root==null) return 0;
    return Math.max(getHeight(root.left), getHeight(root.right))+1;
  }
  
  public static boolean isBalanced(TreeNode root){
    if(root==null) return true;
    
    int heightDiff=Math.abs(getHeight(root.left)-getHeight(root.right));
    if(heightDiff>1) return false;
    else return isBalanced(root.left)&&isBalanced(root.right);
  }
}
