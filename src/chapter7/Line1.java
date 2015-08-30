package chapter7;

public class Line1 {
  public double slope;
  public double yintercept;
  static double epsion=0.000001;
  public Line1(double s,double y){
    slope=s;
    yintercept=y;
  }
  public void status(Line1 l2){
    if(Math.abs(slope-l2.slope)>epsion) 
      System.out.println("Intersect");
    else if(Math.abs(yintercept-l2.yintercept)>epsion)
      System.out.println("Paralle");
      else  System.out.println("One Line");
  }
}
