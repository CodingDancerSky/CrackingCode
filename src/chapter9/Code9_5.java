package chapter9;

import java.util.ArrayList;

public class Code9_5 {
  public static void main(String[] args) {
    ArrayList<String> list = getPerm("abcde");
    System.out.println("There are " + list.size() + " permutations.");
    for (String s : list) {
      System.out.println(s);
    }
  }
  
 static String insertChar(String word,char c,int i){
      String start=word.substring(0, i);
      String end=word.substring(i);
      return start+c+end;

    }
 
 static ArrayList<String> getPerm(String word){
   if(word==null) {  
     return null;   
   }
   
   ArrayList<String> permutatins=new ArrayList<String>();
   if(word.length()==0){
     permutatins.add(" ");    
     return permutatins;
   }
   
   char a=word.charAt(0);
   String remainder=word.substring(1);
   //System.out.println(remainder);
   ArrayList<String> newword=getPerm(remainder);
   for(String temp:newword){
     //System.out.println(temp);
     for(int i=0;i<temp.length();i++){
       String s=insertChar(temp, a, i);
      // System.out.println(s);
       permutatins.add(s);
     }
   }
   //System.out.println(permutatins);
   return permutatins;
 }
}
