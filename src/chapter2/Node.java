package chapter2;

class Node{
  Node next=null;
  int data;
  
  public Node(){
    
  }
  public Node(int d){
    data=d;
  }
  
  void appendToTail(int d){
    Node end=new Node(d);
    Node n =this;
    while(n.next!=null){
      n=n.next;
    }
    n.next=end;
  }
  

 void displayLinkedList(){
   Node head=this;
  while(head!=null){  
    if(head.next==null) 
      System.out.print(head.data);
    else System.out.print(head.data+"->");   
    head=head.next;
  }  
  System.out.println();
}


}