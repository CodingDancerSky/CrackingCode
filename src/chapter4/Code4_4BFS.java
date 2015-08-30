package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class Code4_4BFS {
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
    
    LinkedList<TreeNode> current=new LinkedList<TreeNode>();
    if(root!=null) current.add(root);
    while(current.size()>0){
      lists.add(current);
      LinkedList<TreeNode> parents=current;
      current=new LinkedList<TreeNode>();
      for(TreeNode parent:parents){
        if(parent.left!=null){
        current.add(parent.left);
      }
        if(parent.right!=null){
          current.add(parent.right);
        }
    }
    }
    return lists;
    
  }
}