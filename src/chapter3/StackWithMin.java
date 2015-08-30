package chapter3;

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin>{
  public void push(int value){
    int newMin=Math.min(min(), value);
    super.push(new NodeWithMin(value,newMin));
  }

  int min() {
    // TODO Auto-generated method stub
    if(this.isEmpty()){
      return Integer.MAX_VALUE;
    }else return peek().min;
  }
}