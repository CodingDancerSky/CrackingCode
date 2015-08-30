package chapter9;

public class Code9_1 {
  public static void main(String[] args) {
    int n=10;
    System.out.println(countWaysRecursive(n));
  }
  public static int countWays(int n){
    //if(n<=0) return 0;
    int[] map=new int[n+1];
    for(int i=0;i<n+1;i++){
      map[i]=-1;
    }
    return countWays(n,map);
  }
  
  public static int countWaysRecursive(int n) {
    if (n < 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else {
      return countWaysRecursive(n - 1) + countWaysRecursive(n - 2) + countWaysRecursive(n - 3);
    }
  }

 public static int countWays(int n, int map[]) {
    // TODO Auto-generated method stub
    if(n<0) {
      return 0;
    }else if(n==0){
      return 1;
      }else if(map[n]>-1){
        return map[n];
      } else {
      map[n]=countWays(n-1, map)+countWays(n-2, map)+countWays(n-3, map);
      return map[n];
    }
  }
}
