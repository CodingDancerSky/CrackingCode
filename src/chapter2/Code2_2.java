package chapter2;

public class Code2_2 {
public static void main(String[] args){
  int a[]={1,2,3,4,2,3,3,6,55};
  Node head=CreateLinkedList(a,a.length);
  System.out.print("The kth element to the last one of ");
  head.displayLinkedList();
  
  findKtoLast(head,3);
  

}



private static int findKtoLast(Node head, int i) {
  // TODO Auto-generated method stub
  if(head==null){
    return 0;
  }
  int k=findKtoLast(head.next,i)+1;
  if(i==k) 
  System.out.println(head.data);
  return k;      
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