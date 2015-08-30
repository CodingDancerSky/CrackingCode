package chapter4;

import CtCILibrary.*;

public class Code4_6 {
  public static void main(String[] args) {
    int[] array = {2, 3, 5, 6, 10, 13, 15,50};
    TreeNode root = TreeNode.createMinimalBST(array);
    root.print();
    for (int i = 0; i < array.length; i++) {
      TreeNode node = root.find(array[i]);
      TreeNode next = inorderNext(node);
      if (next != null) {
        System.out.println(node.data + "->" + next.data);
      } else {
        System.out.println(node.data + "->" + null);
      }
    }
  }
  
  static TreeNode inorderNext(TreeNode n){
    if(n==null) return null;
    if(n.right!=null) return leftmostChild(n.right);
    else {
      while(n.parent!=null&&n.parent.right==n) n=n.parent;
      return n.parent;
    }
  }

   static TreeNode leftmostChild(TreeNode n) {
    // TODO Auto-generated method stub
     if(n==null) return null;
     if(n.left!=null) n=n.left;
     return n;
  }
}
