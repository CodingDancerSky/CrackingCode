package chapter1;

public class Code1_5 {
public static void main(String[] args){
  String str1="abccccdddddddddddddd";
  String str2="abbbbbbbbbbcdefghijklm";
  
  System.out.println(getString(str1));
  System.out.println(getString(str2));  
}

private static String getString(String str) {
  if(getLength(str)>=str.length()) 
    return str;
  
  StringBuffer newstring=new StringBuffer();
  char last=str.charAt(0);
  int count=1;
  
  for(int i=1;i<str.length();i++){
      if(last!=str.charAt(i)) {
        newstring.append(last);
        newstring.append(count); 
        count=1;
      }
      else count++;
      last=str.charAt(i);
}
  newstring.append(last);
  newstring.append(count);
  return newstring.toString();
}

static int getLength(String str){
  char[] array=str.toCharArray();
  char val=array[0];
  int count=2;

  for(int i=1;i<str.length();i++){
    if(array[i]!=val) count+=2;
    val=array[i];
  }
  System.out.println(count);

  return count;
}

}
