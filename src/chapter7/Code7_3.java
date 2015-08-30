package chapter7;

public class Code7_3 {
  
  public static int randomInt(int n) {
    return (int) (Math.random() * n);
  }
  
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Line1 line1 = new Line1(randomInt(5), randomInt(1));
      Line1 line2 = new Line1(randomInt(5), randomInt(2));
      
      line1.status(line2);
    }
  }
}
