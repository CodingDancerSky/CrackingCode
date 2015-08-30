package chapter4;

import CtCILibrary.*;

public class Code4_3 {
  public static void main(String a[])
  {
   int array[]={0,1,2,3,4,5,6,7};
   TreeNode root=createBST(array);
   System.out.println(root.data);
  }

   public static TreeNode createBST(int[] array) {
    // TODO Auto-generated method stub
    int start=0,end=array.length-1;
    
    return createBST(array,start,end);
  }

   public static TreeNode createBST(int[] array,int start,int end) {
    // TODO Auto-generated method stub
    if(end<start) return null;
    
    int middle=(start+end)/2;
    TreeNode n=new TreeNode(array[middle]);
    n.left=createBST(array,start,middle-1);
    n.right=createBST(array,middle+1,end);
    return n;
  }
}
