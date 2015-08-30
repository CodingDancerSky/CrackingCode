package chapter17;

public class Code17_2 {
static int hasWin(int[][] board){
  int N=board.length;
  
  for(int i=0;i<N-1;i++){
    for(int j=0;j<N-3;j++){
      if(board[i][j]==board[i][j+1]&&board[i][j]==board[i][j+2])
        return board[i][j];
    }
  }
  
  for(int j=0;j<N-1;j++){
    for(int i=0;i<N-3;i++){
      if(board[i][j]==board[i+1][j]&&board[i][j]==board[i+2][j])
        return board[i][j];
    }
  }
  
  for(int i=0;i<N-3;i++){
    for(int j=0;j<N-3;j++){
      if(board[i][j]==board[i+1][j+1]&&board[i][j]==board[i+2][j+2])
        return board[i][j];
    }
  }
  
  for(int i=0;i<N-3;i++){
    for(int j=0;j<N-3;j++){
      if(board[i+2][j]==board[i+1][j+1]&&board[i+2][j]==board[i][j+2])
        return board[i+2][j];
    }
  }
  return 0;
}
}
