package chapter4;

import CtCILibrary.*;

public class Code4_7optimized {
public static class Result{
  public TreeNode node;
  public boolean isAncestor;
  public Result(TreeNode n,Boolean isAn){
    node=n;
    isAncestor=isAn;
  }
}

static TreeNode commonAncestor(TreeNode root, TreeNode p,TreeNode q){
  Result r=commonAncestorHelp(root, p, q);
  if(r.isAncestor) return r.node;
  else return null;
}

static Result commonAncestorHelp(TreeNode root, TreeNode p, TreeNode q) {
  // TODO Auto-generated method stub
  if(root==null) return new Result(null, false);
  if(root==p&&root==q) return new Result(root, true);
  
  Result rx=commonAncestorHelp(root.left, p, q);
  if(rx.isAncestor) return rx;
  Result ry=commonAncestorHelp(root.right, p, q);
  if(ry.isAncestor) return ry;
  
  if(rx.node!=null&&ry.node!=null){
    return new Result(root, true);
  }else if(root==p||root==q){
    boolean isAncestor=rx.node!=null||ry.node!=null?true:false;
    return new Result(root, isAncestor);
  }else return new Result(rx.node!=null?rx.node:ry.node,false);
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
