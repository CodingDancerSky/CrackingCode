package chapter1;

public class Code1_2 {
  public static void main(String[] arg){
    
   String str="abcdefg";
   
   Code1_2 c=new Code1_2();
   c.hasReverse(str);
  }
  
   void hasReverse(String str){
    char[] array=str.toCharArray();
    String reverse="";
    for(int i=str.length()-1;i>=0;i--){
      reverse+=array[i];       
}
    System.out.println(reverse);
}
}