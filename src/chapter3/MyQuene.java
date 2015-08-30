package chapter3;
import java.util.Stack;

public class MyQuene<T> {
Stack<T> stackNewest,stackOldest;

public MyQuene(){
  stackNewest=new Stack<T>();
  stackOldest=new Stack<T>();
}

public int size(){
  return stackNewest.size()+stackOldest.size();
}

public void add(T value){
  stackNewest.push(value);
}

private void shiftStacks(){
  if(stackOldest.isEmpty()){
    while(!stackNewest.isEmpty()){
      stackOldest.push(stackNewest.pop());
    }
  }
}

public T peek(){
  shiftStacks();
  return stackOldest.peek();
}

public T pop(){
  shiftStacks();
  return stackOldest.pop();
}
}
