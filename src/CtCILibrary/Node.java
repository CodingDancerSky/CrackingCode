package CtCILibrary;

public class Node{
  private Node adjacent[];
  
  public int adjacentCount;
  private String vertex;
  Node next=null;
  public Node above;
  public Node below;
  public int value;
  public int data;
  public enum State{
    unvisited,visiting,visited;
  }
  public State state;
  
  public Node(){
  }
  public Node(int d){
    data=d;
  }
  
  public void addAdjacent(Node x) {
    if (adjacentCount < 30) {
        this.adjacent[adjacentCount] = x;
        adjacentCount++;
    } else {
        System.out.print("No more adjacent can be added");
    }
}
public Node[] getAdjacent() {
    return adjacent;
}
public String getVertex() {
    return vertex;
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
 public Node(String vertex, int adjacentLength) {
   this.vertex = vertex;                
   adjacentCount = 0;        
   adjacent = new Node[adjacentLength];
}

 
}