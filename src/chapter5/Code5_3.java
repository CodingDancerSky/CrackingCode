package chapter5;

public class Code5_3 {
  static public void main(String[] args){
    int m1=0b11011001111100;
    System.out.println(Integer.toBinaryString(m1));
    System.out.println(Integer.toBinaryString(getNext(m1)));
    System.out.println("-----------------------");
    int m2=0b10011110000011;
    System.out.println(Integer.toBinaryString(m2));
    System.out.println(Integer.toBinaryString(getLast(m2)));
  }

  static int getLast(int m2) {
    // TODO Auto-generated method stub
    int c1=0;
    int c0=0;
    int temp1=m2;
    
    while((temp1&1)==1){
      c1++;
      temp1=temp1>>1;
    }
    while((temp1&1)==0){
      c0++;
      temp1=temp1>>1;
    }
    int p=c1+c0;
    temp1=(~0)<<(p+1);
    int step1=m2&temp1;
    System.out.println(Integer.toBinaryString(step1));

    int temp2=(1<<(c1+1))-1;
    int step2=step1|(temp2<<(c0-1));
    System.out.println(Integer.toBinaryString(step2));

    return step2;
    }

  static int getNext(int m1) {
    // TODO Auto-generated method stub
    int c0=0;
    int c1=0;
    int temp1=m1;
    
    while((temp1&1)==0){
      c0++;
      temp1=temp1>>1;
    }
    while((temp1&1)==1){
      c1++;
      temp1=temp1>>1;
    }
    int p=c1+c0;
    int step1=m1|(1<<p);
    
    int temp2=~((1<<p)-1);
    int step2=step1&temp2;
    System.out.println(Integer.toBinaryString(step2));

    int temp3=(1<<(c1-1))-1;
    int step3=step2|temp3;
    System.out.println(Integer.toBinaryString(step3));

    return step3;
  }
}
