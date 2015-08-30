package chapter1;

public class Code1_4improved {
  public static void main(String[] arg){
    String check="   ";
    System.out.println("The original one is:"+check);
    System.out.println("And then: " + fillSpaces(check));
  }
  
static String fillSpaces(String str){
  // implement StringBuffer to store the new String
  StringBuffer sb = new StringBuffer();
  for(char c: str.toCharArray()){
    if(c == ' ')
      sb.append("%20");
    else sb.append(c);
  }
  
  return sb.toString();
}
}
