package chapter2;

import java.util.Stack;

public class Code2_4 {
  public static void main(String[] args){
    int a[]={1,2,3,4,2,3,22,6,55};
    int x=5;
    Node head=CreateLinkedList(a,a.length);
    head.displayLinkedList();
    System.out.println("Rearragement the linked list:");
    
    rearragLinkedList(head,x);
    
}

  static void rearragLinkedList(Node head, int x) {
    // TODO Auto-generated method stub
    Node beforeStart=null;
    Node beforeEnd=null;
    Node afterStart=null;
    Node afterEnd=null;

    while(head!=null){
    Node next=head.next;
    head.next=null;
    if(head.data<x){
      if(beforeStart==null){
        beforeStart=head;
        beforeEnd=beforeStart;
      }else{
        beforeEnd.next=head;
        beforeEnd=head;
      }
    } else {
      if(afterStart==null){
      afterStart=head;
      afterEnd=afterStart;
    }else{
      afterEnd.next=head;
      afterEnd=head;
      }
    }
    
    head=next;   
  }
    
    beforeEnd.next=afterStart;
    beforeStart.displayLinkedList();

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
  }
