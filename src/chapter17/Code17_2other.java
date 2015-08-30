package chapter17;

public class Code17_2other {
  public static void main(String[] args) {
    char[][] board = { 
        {'x', 'x', 'o'},
        {' ', 'x', ' '},
        {' ', ' ', 'x'}};
    
    int v = boardToInt(board);
    System.out.println(v);
  }
static int boardToInt(char[][] board){
  int factor=1;
  int sum=0;
  System.out.println(board.length);

  for(int i=0;i<board.length;i++){
    for(int j=0;j<board[0].length;j++){
      int v=0;
      switch(board[i][j]){
        case 'x':v=1;break;
        case 'o':v=2;break;
      }
      sum+=factor*v;
      factor*=3;
    }    
  }
  return sum;
}
}
