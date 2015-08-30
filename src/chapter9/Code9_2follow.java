package chapter9;

import java.awt.Point;
import java.util.*;

import CtCILibrary.*;

public class Code9_2follow {
  static int[][] map=new int[6][6];
public static void main(String[] args) {
  map = AssortedMethods.randomMatrix(6, 6, 0, 3);
  AssortedMethods.printMatrix(map);
  int x=3,y=3;
  int value=getPaths(x,y);
  System.out.println(map[x][y]);     
  if(value<0){
    System.out.println("This point isn't allowed.");     
  }else if(value==0){
    System.out.println("No path exists." );     
  }else System.out.println("The number of path: "+value);
}

 static int getPaths(int i, int j) {
  // TODO Auto-generated method stub
  if(map[i][j]==0) return -1;
  Hashtable<Point, Integer> cache = new Hashtable<Point, Integer>();
  return getPaths(i,j,cache);
}

static int getPaths(int x, int y,Hashtable<Point,Integer> cache){
  Point p=new Point(x,y);
  int path=0;
  Point o=new Point(0,0);
  cache.put(o, 1);
  if(cache.containsKey(p)) return cache.get(p);
  if(x<0||y<0) return 0;
  if(isFree(x-1,y)) path+=getPaths(x-1,y,cache);
  if(isFree(x,y-1)) path+=getPaths(x,y-1,cache);
  cache.put(p, path);
  return path;
  }

static boolean isFree(int i, int j) {
  // TODO Auto-generated method stub
  if(i<0||j<0) return false;
  if(map[i][j]==0) return false;
  return true;
}
}
