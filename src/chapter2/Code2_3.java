package chapter2;

public class Code2_3 {
  public static void main(String[] args){
    int a[]={1,2,3,4,2,3,22,6,55};
    Node head=CreateLinkedList(a,a.length);
    head.displayLinkedList();
    Node delete=head.next.next.next;
    System.out.println("Delete "+delete.data+" from linked list.");
    deleteNode(delete);
    
  }

 static void deleteNode(Node delete) {
    // TODO Auto-generated method stub
    delete.data=delete.next.data;
    delete.next=delete.next.next;
    delete.displayLinkedList();
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
