package chapter7;

public class Code7_4 {
  public static void main(String[] args) {
    int a=52,b=0;
    System.out.println("a*b="+multiply(a,b));
    System.out.println("a-b="+subtract(a,b));
    System.out.println("a/b="+divide(a,b));
  }

  static int subtract(int a, int b) {
    // TODO Auto-generated method stub
    return a+(-b);
  }

  static int multiply(int a, int b) {
    // TODO Auto-generated method stub
    int result=0;
    if(a>=0){
      for(int i=0;i<a;i++)
        result+=b;
    }else{
      for(int i=0;i<-a;i++)
        result+=b;
      result=-result;
    } 
    return result;
    }
  
  static int divide(int a, int b) throws java.lang.ArithmeticException {
    // TODO Auto-generated method stub   
      if(b==0){
        throw new java.lang.ArithmeticException("The divided number couldn't be 0!");
      }
      int absa=Math.abs(a);
      int absb=Math.abs(b);
      int product=0;
      int result=0;
      while(product+absb<=absa){
        product+=absb;
        result++;
      }
      if((a<0&&b<0)||(a>0&&b>0)){
        return result;
        } else return -result;
    }
  }
