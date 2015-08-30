package chapter4;

import CtCILibrary.*;

public class Code4_8 {
static boolean containTree(TreeNode p,TreeNode q){
  if(q==null) return true;
  if(p==null) return false;
  if(q.data==p.data){
    return matchTree(p,q);
  }
  return containTree(p.left,q)||containTree(p.right, q);
}

static boolean matchTree(TreeNode p, TreeNode q) {
  // TODO Auto-generated method stub
  if(p==null&&q==null) return true;
  if(p==null||q==null) return false;
  if(p.data!=p.data) return false;
  return matchTree(p.right,q.right)&&matchTree(p.left, q.left);
}

public static void main(String[] args) {
  // t2 is a subtree of t1
  int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
  int[] array2 = {2, 4, 5, 8, 9, 10, 11};
  
  TreeNode t1 = AssortedMethods.createTreeFromArray(array1);
  TreeNode t2 = AssortedMethods.createTreeFromArray(array2);

  if (containTree(t1, t2))
    System.out.println("t2 is a subtree of t1");
  else
    System.out.println("t2 is not a subtree of t1");

  // t4 is not a subtree of t3
  int[] array3 = {1, 2, 3};
  TreeNode t3 = AssortedMethods.createTreeFromArray(array1);
  TreeNode t4 = AssortedMethods.createTreeFromArray(array3);

  if (containTree(t3, t4))
    System.out.println("t4 is a subtree of t3");
  else
    System.out.println("t4 is not a subtree of t3");
}

}
