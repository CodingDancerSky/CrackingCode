package chapter1;

public class Code1_8 {
public static void main(String[] args){
  String str1="youaremysunshine";
  String str2="mysunshineyouare";
  System.out.println("Hello!");
  
  if(isRotation(str2,str1)) System.out.println(str2+" is the rotation of "+str1);
  else System.out.println("Nope!");
}

static boolean isRotation(String str2, String str1) {
  // TODO Auto-generated method stub
  String add=str1+str1;
  return add.contains(str2);
}
}
