package chapter1;

import java.util.HashMap;

public class Code1_3improved {
  public static void main(String[] arg){
    
    if(isPermutation("b cde","cdeb  ")) System.out.println("Yes!");
     else System.out.println("No!");
     
   }
  
static boolean isPermutation(String s1, String s2){
  int len1 = s1.length();
  int len2 = s2.length();
  
  //if the lengths of two strings are not equal, obviously they are not permutations
  if(len1 != len2)
    return false;
  
  //store the appearance times of the character in the first string by implementing hashmap
  HashMap<Character, Integer> checker = new HashMap<Character, Integer>();
  for(char c: s1.toCharArray()){
    if(checker.containsKey(c))
      checker.put(c, checker.get(c) + 1);
    else checker.put(c, 1);
  }
  
  //visit each character in the second string, and decrease its counter by 1 in the hashmap
  for(char c: s2.toCharArray()){
    if(checker.containsKey(c)){
      if(checker.get(c) > 0)
        checker.put(c, checker.get(c) - 1);
      else return false; // the count is less than 1, which means the appearance times of this character in two strings are not equal 
    } else return false; // if the first string does not contains this character, they are not permutations.    
  }
  
  //we do not need to check whether the counters in the hashmap are all 0 because there must exists at least one character in the second string appears more times than in the first if theses two strings with same length are permutations
  return true;
}
}
