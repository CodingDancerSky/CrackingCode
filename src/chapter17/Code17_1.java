package chapter17;

public class Code17_1 {
  static void swap1(int a,int b){
    a=a-b;
    b=a+b;
    a=b-a;
  }
  
  static void swap2(int a, int b){
    a=a^b;
    b=a^b;
    a=a^b;
  }
  
  public static void main(String[] args) {
    int a = 1672;
    int b = 9332;
    
//    System.out.println("a: " + a);
//    System.out.println("b: " + b);
    
    swap1(a, b);
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    swap2(a, b);
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}
