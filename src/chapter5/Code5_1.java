package chapter5;

public class Code5_1 {
  public static void main(String[] args){
int m=0b101100101100;
int n=Integer.parseInt("10011", 2);
int i=2,j=6;
int result=insertNtoM(m,n,i,j);

System.out.print("Insert ");
System.out.print(Integer.toBinaryString(n));
System.out.print(" into ");
System.out.print(Integer.toBinaryString(m));
System.out.println(" is:");
System.out.println(Integer.toBinaryString(result));

}

  private static int insertNtoM(int m, int n, int i, int j) {
    // TODO Auto-generated method stub
    int all1s=~0;
    int j_0=all1s<<(j+1);
    int i_1=1<<i-1;
    int insert0=j_0|i_1;
    
    int clear=insert0&m;
    int shift=n<<i;
    int merge=clear|shift;
    return merge;
  }

}
