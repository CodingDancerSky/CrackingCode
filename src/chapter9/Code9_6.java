package chapter9;

import java.util.HashSet;
import java.util.Set;

public class Code9_6 {
  public static void main(String[] args) {
    Set<String> list = createParens(4);
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println(list.size());
  }

public static Set<String> createParens(int remaining){
  Set<String> set=new HashSet<String>();
  if(remaining==0) set.add("");
  else{
    Set<String> prev=createParens(remaining-1);
    for(String temp:prev){
      for(int i=0;i<temp.length();i++){
        if(temp.charAt(i)=='('){
          String s=insertInsider(temp,i);
          set.add(s);
        }
      }
      if(!set.contains("()"+temp)){
        set.add("()"+temp);
      }
    }
  }
  return set;
}

static String insertInsider(String temp, int leftIndex) {
  // TODO Auto-generated method stub
  String left=temp.substring(0, leftIndex+1);
  String right=temp.substring(leftIndex+1,temp.length());
  return left+"()"+right;
}
}
