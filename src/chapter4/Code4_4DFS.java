package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import CtCILibrary.*;

public class Code4_4DFS {
public static void main(String[] args){
  int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  TreeNode root = AssortedMethods.createTreeFromArray(nodes_flattened);
  
  ArrayList<LinkedList<TreeNode>> lists=createLevelLinkedList(root);
  int depth=0;
  for(LinkedList<TreeNode> entry : lists){
    Iterator<TreeNode> i = entry.listIterator();
    System.out.print("Link list at depth " + depth + ":");
    while(i.hasNext()){
      System.out.print(" " + ((TreeNode)i.next()).data);
    }
    System.out.println();
    depth++;    
  }
}

static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
  // TODO Auto-generated method stub
  ArrayList<LinkedList<TreeNode>> lists=new ArrayList<LinkedList<TreeNode>>();
  createLevelLinkedList(root,lists,0);
  return lists;
}

static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
  // TODO Auto-generated method stub
  if(root==null) return;
  
  LinkedList<TreeNode> list=null;
  if(lists.size()==level){
    list=new LinkedList<TreeNode>();
    lists.add(list);
  }else list=lists.get(level);
  list.add(root);
  createLevelLinkedList(root.left,lists,level+1);
  createLevelLinkedList(root.right,lists,level+1);

}
}
