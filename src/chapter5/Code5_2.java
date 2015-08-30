package chapter5;

public class Code5_2 {
static public void main(String[] args){
  double m=32.72;

  displayBinary(m); 
}

static void displayBinary(double m) {
  // TODO Auto-generated method stub
  int m_int=(int)m;
  System.out.print(Integer.toBinaryString(m_int)+".");
  
  StringBuilder decimal=new StringBuilder();
  double m_decimal=m-m_int;
  
  m_decimal*=2;
  
  while(m_decimal>0){
  if(m_decimal>=1) {
    decimal.append(1);
    m_decimal--;

  }
  else decimal.append(0);  

  m_decimal*=2;
  }
 System.out.println(decimal);

}
}
