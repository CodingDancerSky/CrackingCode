package chapter5;

public class Code5_6 {
public static void main(String[] args){
  int m=0b1010101010;
  int oddTeven=((m&0xaaaaaaaa)>>1);
  int evenTodd=((m&0x55555555)<<1);
  int result=oddTeven|evenTodd;
  
  System.out.println(Integer.toBinaryString(result));
}
}
