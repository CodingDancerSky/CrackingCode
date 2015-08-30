package chapter4;

import CtCILibrary.*;

public class Code4_5 {
  public static void main(String[] args) {
    int[] array = {2, 3, 5, 6, 10, 13, 15,50};
    TreeNode node = TreeNode.createMinimalBST(array);
    node.left.data = 6; // "ruin" the BST property by changing one of the elements
    node.print();
    boolean isBst = checkBST(node);
    System.out.println(isBst);
  }

   static boolean checkBST(TreeNode node) {
    // TODO Auto-generated method stub
    return checkBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }

   static boolean checkBST(TreeNode node, int min, int max) {
    // TODO Auto-generated method stub
     if(node==null) return true;
     if(node.data<min||node.data>max) return false;
     if(!checkBST(node.left,min,node.data)||!checkBST(node.right,node.data,max)) return false;
     return true;
  }
}
