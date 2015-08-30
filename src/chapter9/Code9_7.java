package chapter9;

public class Code9_7 {
  public enum Color {
    Black, White, Red, Yellow, Green
  }
  
  public static String PrintColor(Color c) {
    switch(c) {
    case Black:
      return "B";
    case White:
      return "W";
    case Red:
      return "R";
    case Yellow:
      return "Y";
    case Green:
      return "G";
    }
    return "X";
  }
  
  
  static void paintFill(Color[][] screen,int x, int y,Color ocolor,Color color){
    if(x<0||x>=screen[0].length||y<0||y>=screen.length){
      System.out.println("Error!");
    }else if(screen[y][x]==ocolor){
      screen[y][x]=color;
      paintFill(screen,x-1,y,ocolor,color);
      paintFill(screen,x+1,y,ocolor,color);
      paintFill(screen,x,y-1,ocolor,color);
      paintFill(screen,x,y+1,ocolor,color);
    }
  }
  public static void PrintScreen(Color[][] screen) {
    for (int i = 0; i < screen.length; i++) {
      for (int j = 0; j < screen[0].length; j++) {
        System.out.print(PrintColor(screen[i][j]));
      }
      System.out.println();
    }
  }
  public static int randomInt(int n) {
    return (int) (Math.random() * n);
  }
  public static void main(String[] args) {
    int N = 10;
    Color[][] screen = new Color[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        screen[i][j] = Color.Black;
      }     
    }
    for (int i = 0; i < 100; i++) {
      screen[randomInt(N)][randomInt(N)] = Color.Green;
    }
    PrintScreen(screen);
    paintFill(screen, 2, 2, Color.White);
    System.out.println();
    PrintScreen(screen);
  }
  public static void paintFill(Color[][] screen, int x, int y, Color ncolor) {
    if (screen[y][x] == ncolor) System.out.println("E");
     paintFill(screen, x, y, screen[y][x], ncolor);
  }
  
}
