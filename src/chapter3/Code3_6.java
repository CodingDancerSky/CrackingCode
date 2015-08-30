package chapter3;
import java.util.Stack;

import CtCILibrary.AssortedMethods;

public class Code3_6 {
  public static void main(String [] args) {
    for (int k = 1; k < 100; k++) {
      Stack<Integer> s = new Stack<Integer>();
      for (int i = 0; i < 10 * k; i++) {
        int r = AssortedMethods.randomIntInRange(0,  1000);
        s.push(r);
      }
      s = sort(s);
      while(!s.isEmpty()) {
        int curr = s.pop();
        System.out.println(curr);
      }
    }
  }
  
public static Stack<Integer> sort(Stack<Integer> s){
  Stack<Integer> r= new Stack<Integer>();
  while(!s.isEmpty()){
    int tmp=s.pop();
    while(!r.isEmpty()&&r.peek()>tmp){
      s.push(r.pop());
    }
    r.push(tmp);
  }
  return r;
}
}
