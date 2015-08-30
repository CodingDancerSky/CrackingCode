package chapter1;

public class Code1_1improved {
  public static void main(String[] arg){
    String str1="abcdqwnv";
    String str2="abshasd";
    
    Code1_1 c1=new Code1_1();
    c1.hadDisplay(str1);
    c1.hadDisplay(str2);
   
  }
  
  void hadDisplay(String str){
    Code1_1improved c2=new Code1_1improved();
    if(c2.isUniqueImproved(str))  
      System.out.println(str+" has all unique character.");
    else System.out.println(str+" has repeated characters.");
  }
  
  boolean isUniqueImproved(String str){
    str = str.trim(); // ignore the spaces;
    
    int len = str.length(); 
    if(len <= 1)  // if the string is "" or contains only one character, it means no repeated character.
      return true;
    
    int[] map = new int[8];  // mark the appearance of the character by bit
    int val = 0;  // the ASCII of one character
    
    // the coordination of the character
    int index = 0;  
    int shift = 0;
    
    // visit each character iteratively
    for(int i = 0; i < len ; i++){ //implement
      val = (int) str.charAt(i);
      index = val / 32;
      shift = val % 32;
      
      // judge whether this character has appeared 
      if((map[index] & (1 << shift)) == 1)
        return false;
      
      // set the corresponding position of the character as 1;
      map[index] = (1 << shift);
    }
    
    // after visiting every character without repetition, it proves there is no repeated character in the string
    return true;
  }
}
