package chapter3;

public class Code3_1 {
  static int stacksize=100;
  static int[] array=new int[stacksize*3];
  static int[] pointer={-1,-1,-1};
  public static void main(String[] args) throws Exception {
    push(2, 4);
    System.out.println("Peek 2: " + peek(2));
    push(0, 3);
    push(0, 7);
    push(0, 5);
    System.out.println("Peek 0: " + peek(0));
    pop(0);
    System.out.println("Peek 0: " + peek(0));
    pop(0);
    System.out.println("Peek 0: " + peek(0));
  }
  
  static void push(int stackNum,int value) throws Exception{
    if(pointer[stackNum]+1>=stacksize){
      throw new Exception("Out of Space.");
    }
    pointer[stackNum]++;
    array[getNum(stackNum)]=value;
  }
  
  static int pop(int stackNum) throws Exception{
    if(pointer[stackNum]==-1){
      throw new Exception("Try to pop an empty stack.");
    }
    int value=array[getNum(stackNum)];
    array[getNum(stackNum)]=0;
    pointer[stackNum]--;
    return value;
  }
  
  static int peek(int stackNum) throws Exception{
    if(pointer[stackNum]==-1){
      throw new Exception("Try to pop an empty stack.");
    }
    return array[getNum(stackNum)];
  }

   static int getNum(int stackNum) {
    // TODO Auto-generated method stub
    return stackNum*stacksize+pointer[stackNum];
  }

}
