package chapter4;

import java.util.LinkedList;

import CtCILibrary.*;
import CtCILibrary.Node.State;

public class Code4_2 {
  public static void main(String a[])
  {
    Graph g = createNewGraph();
    Node[] n = g.getNodes();
    Node start = n[3];
    Node end = n[5];
    System.out.println(n[3].data);
    System.out.println(hasRoute(g, start, end));
  }

 static Graph createNewGraph() {
   Graph g = new Graph();        
   Node[] temp = new Node[6];

   temp[0] = new Node("a", 3);
   temp[1] = new Node("b", 0);
   temp[2] = new Node("c", 0);
   temp[3] = new Node("d", 1);
   temp[4] = new Node("e", 1);
   temp[5] = new Node("f", 0);

   temp[0].addAdjacent(temp[1]);
   temp[0].addAdjacent(temp[2]);
   temp[0].addAdjacent(temp[3]);
   temp[3].addAdjacent(temp[4]);
   temp[4].addAdjacent(temp[5]);
   for (int i = 0; i < 6; i++) {
     g.addNode(temp[i]);
   }
   return g;
  }

static boolean hasRoute(Graph g,Node a,Node b){
  LinkedList<Node> q=new LinkedList<Node>();
  for(Node u:g.getNodes()){  //set all nodes unvisited
    u.state=State.unvisited;
  }
  
  a.state=State.visiting; //set the start node a visiting
  q.add(a);  //add a to list q
  Node u;
  while(!q.isEmpty()){
    u=q.removeFirst();
    if(u!=null){
      for(Node v:u.getAdjacent()){
        if(v.state==State.unvisited){
          if(v==b) return true;
          else {
            v.state=State.visiting;
            q.add(v);
          }        
        }
      }
      u.state=State.visiting;
    }
  }
  return false;
}


}

