package chapter5;

public class Code5_5 {
  static public void main(String[] args){
    int a=0b1110,b=0b0011;
    int count=0;
    for(int c=a^b;c!=0;c=c>>1){
      //if((c&1)==1) count++;
      count+=c&1;
    }
    System.out.println(count);
  }
}
