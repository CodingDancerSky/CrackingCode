package chapter2;

import CtCILibrary.*;

public class Code2_5followup {
static class PartialSum{
  public LinkedListNode sum=null;
  public int carry=0;
}

public static LinkedListNode addLists(LinkedListNode l1,LinkedListNode l2){
  int len1=length(l1);
  int len2=length(l2);
  
  if(len1<len2){
    l1=padList(l1,len2-len1);
  }else {
    l2=padList(l2,len1-len2);
  }
  
  PartialSum sum=addListHelper(l1,l2);
  
  if(sum.carry==0) return sum.sum;
  else{
    LinkedListNode result=insertBefore(sum.sum,sum.carry);
    return result;
  }
}

 private static LinkedListNode insertBefore(LinkedListNode list, int data) {
  // TODO Auto-generated method stub
   LinkedListNode node = new LinkedListNode(data, null, null);
   if (list != null) {
     list.prev = node;
     node.next = list;
   }
   return node;
   }

static LinkedListNode padList(LinkedListNode l, int padding) {
  // TODO Auto-generated method stub
   LinkedListNode head=l;
   for(int i=0;i<padding;i++){
     LinkedListNode n=new LinkedListNode(0,null,null);
     head.prev=n;
     n.next=head;
     head=n;
   }
   return head;
}

static PartialSum addListHelper(LinkedListNode l1, LinkedListNode l2) {
  // TODO Auto-generated method stub
  if(l1==null&&l2==null){
    PartialSum sum=new PartialSum();
    return sum;
  }
  
  PartialSum sum=addListHelper(l1.next, l2.next);
  int value=sum.carry;
  if(l1!=null) value+=l1.data;
  if(l2!=null) value+=l2.data;
  
  LinkedListNode full_result=insertBefore(sum.sum,value%10);
  
  sum.sum=full_result;
  sum.carry=value/10;
  return sum;
}

private static int length(LinkedListNode l) {
  if (l == null) {
    return 0;
  } else {
    return 1 + length(l.next);
  }
}
public static int linkedListToInt(LinkedListNode node) {
  int value = 0;
  while (node != null) {
    value = value * 10 + node.data;
    node = node.next;
  }
  return value;
} 
public static void main(String[] args) {
  LinkedListNode lA1 = new LinkedListNode(3, null, null);
  LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
  LinkedListNode lA3 = new LinkedListNode(5, null, lA2);
  
  LinkedListNode lB1 = new LinkedListNode(5, null, null);
  LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
  LinkedListNode lB3 = new LinkedListNode(1, null, lB2);  
  
  LinkedListNode list3 = addLists(lA1, lB1);
  
  System.out.println("  " + lA1.printForward());    
  System.out.println("+ " + lB1.printForward());      
  System.out.println("= " + list3.printForward());  
  
  int l1 = linkedListToInt(lA1);
  int l2 = linkedListToInt(lB1);
  int l3 = linkedListToInt(list3);
  
  System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
  System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));    
}
}
