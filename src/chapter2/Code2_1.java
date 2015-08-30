package chapter2;

import java.util.Hashtable;

public class Code2_1 {
public static void main(String[] args){
   int a[]={1,2,3,4,2,3,3,6,55};
   Node head=CreateLinkedList(a,a.length);
   //Node head2=head;
   System.out.println("The original linked list is:");
   head.displayLinkedList();
//   
//   deleDups(head);
//   System.out.println("After delete the duplicate element:");
//   displayLinkedList(head);
   
   noBufferdeleDups(head);
   System.out.println("Delete the duplicate element without buffer:");
   head.displayLinkedList();
}

static Node CreateLinkedList(int[] a, int length) {//add to the head
  // TODO Auto-generated method stub
  Node head=new Node(a[0]);
  for(int i=1;i<length;i++){
    Node newhead=new Node(a[i]);
    newhead.next=head;
    head=newhead;
  }
  return head;
}


static void noBufferdeleDups(Node head){
  Node current=head;

  while(current!=null){
    Node runner=current;
  while(runner.next!=null){
    if(runner.next.data==current.data){
      runner.next=runner.next.next;
    }else {
      runner=runner.next;
    }
  }
    current=current.next;
  }
}

public static void deleDups(Node n){
  Hashtable table=new Hashtable();
  Node previous=null;
  while(n!=null){
    if(table.containsKey(n.data)){
      previous.next=n.next;
  }else{
    table.put(n.data, true);
    previous=n;
  }
    n=n.next;
  }
} 

}


