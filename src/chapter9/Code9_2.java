package chapter9;

public class Code9_2 {
  public static void main(String[] args) {
    System.out.println("Ways:");
    System.out.println(countWays(3,4));
  }
  
static int countWays(int x,int y){
  if(x<0||y<0) return 0;
  int[][] map=new int[x+1][y+1];
  for(int i=0;i<x+1;i++){
    for(int j=0;j<y+1;j++){
      map[i][j]=-1;
    }
  }
  return countWays(x,y,map);
}

static int countWays(int x, int y, int[][] map) {
  // TODO Auto-generated method stub
  if(x<0||y<0) return 0;
  if(x==0&&y==0){
    return 1;
  }else if(map[x][y]>-1){
    return map[x][y];
  }else {
    map[x][y]=countWays(x-1,y,map)+countWays(x,y-1,map);
    return map[x][y];
  }
  
 }
}
