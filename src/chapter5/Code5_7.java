package chapter5;
import java.util.ArrayList;
/**
 * ***********太难还未看***************
 * @author Jude
 *
 */
public class Code5_7 {
  public static int n = 14;
  public static final int INTEGER_SIZE = (Integer.toBinaryString(n)).length() + 1;
  public static final int missingNum = 3; // example in CtCI
  
  public static int findMissing(ArrayList<BitInteger> array) {
    /* BitInteger.INTEGER_SIZE - 1 corresponds to the Least Significant Bit.
     * Start from there, and work our way through the bigger bits.
     */
    return findMissing(array, INTEGER_SIZE - 1);
  }
  
  public static int findMissing(ArrayList<BitInteger> input, int column) {
    if (column < 0) { // base case and error condition
      return 0;
    }
    int halfLen = input.size() / 2;
    ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>(halfLen);
    ArrayList<BitInteger> zeroBits = 
        new ArrayList<BitInteger>(input.size() % 2 == 0 ? halfLen : halfLen + 1);
    for (BitInteger t : input) {
      if (t.fetch(column, INTEGER_SIZE) == 0) {
        zeroBits.add(t);
      } else {
        oneBits.add(t);
      }
    } 
    if (zeroBits.size() <= oneBits.size()) { 
      int v = findMissing(zeroBits, column - 1); 
      return (v << 1) | 0;
    } else { 
      int v = findMissing(oneBits, column - 1); 
      return (v << 1) | 1;
    }
  }
  
  public static void main(String[] args) {
    ArrayList<BitInteger> array = new ArrayList<BitInteger>();
    System.out.println("Test case 1: ");
    System.out.print("Array: ");
    for (int i = 0; i < 14; i++) {
      if (i == missingNum) {
        continue;
      } else {
        array.add(new BitInteger(i));
        System.out.print(i + " ");
      }
    }
    System.out.println();
    System.out.print("Missing number: " + findMissing(array));    
  }
}

class BitInteger {
  private int data;
  BitInteger(int i) {
    data = i;
  }
  public int fetch(int i, int INTEGER_SIZE) {
    int d = 1 << ((INTEGER_SIZE - 1) - i);
    int res = (data & d) >> ((INTEGER_SIZE - 1) - i);
    return res;
  }
}