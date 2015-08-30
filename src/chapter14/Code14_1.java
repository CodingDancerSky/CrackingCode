package chapter14;

public class Code14_1 {
  private Code14_1(){
    System.out.println("Code");
  }
  
  static class A{
    private A(){
      System.out.println("A");

    }
  }
static class B extends A{
  public B(){ 
    System.out.println("B");
  }
}
public static void main(String[] args){
  new B();
}

}