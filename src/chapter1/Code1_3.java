package chapter1;

public class Code1_3 {
  public static void main(String[] arg){
    
   if(isPermutation("bcde","cde")) System.out.println("Yes!");
    else System.out.println("No!");
    
  }
  
  static boolean isPermutation(String str1,String str2){
    int[] s1=countChars(str1);
    int[] s2=countChars(str2);
    
    for(int i=0;i<25;i++){
    if(s1[i]!=s2[i])
      return false;
  }
    return true;
  }
  
  static int[] countChars(String str){
    char[] array=str.toCharArray();
    int[] checker=new int[25];
    for(char c:array){
      int val=c-'a';
      checker[val]++;
  }
    return checker;
}
}
