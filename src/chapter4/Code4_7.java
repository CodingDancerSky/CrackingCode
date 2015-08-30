package chapter4;

import CtCILibrary.*;

public class Code4_7 {
static TreeNode commonAncestor(TreeNode root,TreeNode p,TreeNode q){
  if(root==null) return null;
  if((!cover(root,p))||(!cover(root,q))){
    return null;
  }else return commonAncestorHelp(root,p,q);
  
}

 static boolean cover(TreeNode root, TreeNode p) {
  // TODO Auto-generated method stub
   if(root==null) return false;
   if(root==p) return true;
   return cover(root.left,p)||cover(root.right,p);
}
 static TreeNode commonAncestorHelp(TreeNode root,TreeNode p,TreeNode q){
   if(root==null) return null;
   if(root==p||root==q) return root;
   boolean p_is_left=cover(root.left,p);
   boolean q_is_left=cover(root.left,q);
   if(p_is_left!=q_is_left) return root;
   if(p_is_left){
     return commonAncestorHelp(root.left, p, q);
   }else return commonAncestorHelp(root.right, p, q);
 }
 public static void main(String[] args) {
   int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   TreeNode root = TreeNode.createMinimalBST(array);
   root.print();
   TreeNode n3 = root.find(1);
   TreeNode n7 = root.find(2);
   TreeNode ancestor = commonAncestor(root, n3, n7);
   System.out.println(ancestor.data);
}
}
