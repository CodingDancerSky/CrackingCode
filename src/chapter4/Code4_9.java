package chapter4;

import CtCILibrary.*;

public class Code4_9 {
static void findSum(TreeNode node,int sum){
  int depth=depth(node);
  int[] path=new int[depth];
  findSum(node,sum,path,0);
}

static void findSum(TreeNode node, int sum, int[] path, int level) {
  // TODO Auto-generated method stub
  if(node==null) return;
  
  path[level]=node.data;
  
  int t=0;
  for(int i=level;i>=0;i--){
    t+=path[i];
    if(t==sum){
      print(path,i,level);
    }
  }
  
  findSum(node.left,sum,path,level+1);
  findSum(node.right,sum,path,level+1);
  
  path[level]=Integer.MIN_VALUE;
}

static void print(int[] path, int start, int end) {
  // TODO Auto-generated method stub
  for(int i=start;i<=end;i++){
    System.out.print(path[i]+"->");
  }
  System.out.println();
}

static int depth(TreeNode node) {
  // TODO Auto-generated method stub
  if(node==null) return 0;
  else {
    int d=Math.max(depth(node.left),depth(node.right));
    return d+1;
  }
}
public static void main(String [] args){
  TreeNode root = new TreeNode(5);
  root.left = new TreeNode(3);
  root.right = new TreeNode(1);
  root.left.left = new TreeNode(4);
  root.left.right = new TreeNode(8);
  root.right.left = new TreeNode(2);
  root.right.right = new TreeNode(6);
  findSum(root, 8);
}
}
