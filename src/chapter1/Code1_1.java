package chapter1;
public class Code1_1{
  public static void main(String[] arg){
    String str1="abcdqwnv";
    String str2="abshasd";
    
    Code1_1 c1=new Code1_1();
    c1.hadDisplay(str1);
    c1.hadDisplay(str2);
   
  }
  
  void hadDisplay(String str){
    Code1_1 c2=new Code1_1();
    if(c2.isUnique(str))  
      System.out.println(str+" has all unique character.");
    else System.out.println(str+" has repeated characters.");
  }
  
  boolean isUnique(String str){
    int checker=0;
    
    for(int i=0;i<str.length();i++){
      int val=str.charAt(i)-'a';
    if((checker&(1<<val))>0){
      return false;  
    }
    else checker|=1<<val;    
  }
    return true;  //all unique characters
}
}