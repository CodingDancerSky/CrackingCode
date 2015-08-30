package chapter2;

import CtCILibrary.*;

public class Code2_5 {
  public static void main(String[] args){
    LinkedListNode lA1 = new LinkedListNode(9, null, null);
    LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
    LinkedListNode lA3 = new LinkedListNode(9, null, lA2);
    
    LinkedListNode lB1 = new LinkedListNode(1, null, null);
    LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
    LinkedListNode lB3 = new LinkedListNode(0, null, lB2);  
    
    LinkedListNode list3 = add1LinkedLists(lA1, lB1);
    
    System.out.println("  " + lA1.printForward());    
    System.out.println("+ " + lB1.printForward());      
    System.out.println("= " + list3.printForward());  
    
    int l1 = linkedListToInt(lA1);
    int l2 = linkedListToInt(lB1);
    int l3 = linkedListToInt(list3);
    
    System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
    System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));  

}
  public static int linkedListToInt(LinkedListNode node) {
    int value = 0;
    if (node.next != null) {
      value = 10 * linkedListToInt(node.next);
    }
    return value + node.data;
  } 
   
 static LinkedListNode add1LinkedLists(LinkedListNode add1, LinkedListNode add2) {
    // TODO Auto-generated method stub
    if(add1==null||add2==null) return null;
    return add1LinkedLists(add1,add2,0);
  }

  static LinkedListNode add1LinkedLists(LinkedListNode add1, LinkedListNode add2, int carry) {
  // TODO Auto-generated method stub
    if(add1==null&&add2==null&&carry==0) return null; 
    int value=carry;
    LinkedListNode result=new LinkedListNode();
    if(add1!=null) value+=add1.data;
    if(add2!=null) value+=add2.data;
    carry=value>=10? 1:0;
    result.data=value%10;
    if(add1!=null||add2!=null||carry==1){
      LinkedListNode more=add1LinkedLists(add1==null?null:add1.next,add2==null?null:add2.next,carry);
      result.setNext(more);
      }
    return result;
}
 
  }