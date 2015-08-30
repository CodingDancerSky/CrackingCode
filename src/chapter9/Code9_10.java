package chapter9;

import java.util.ArrayList;
import java.util.HashMap;

public class Code9_10 {
  public static void main(String[] args) {
    Box[] boxes = { new Box(3, 4, 1), new Box(8, 6, 2), new Box(7, 8, 3)};

    ArrayList<Box> stack = createStack(boxes, null, new HashMap<Box, ArrayList<Box>>());
    //ArrayList<Box> stack = createStackR(boxes, null);   
    for (int i = stack.size() - 1; i >= 0; i--) {
      Box b = stack.get(i);
      System.out.println(b.toString());
    }
  }

  public static int stackHeight(ArrayList<Box> boxes) {
    if (boxes == null) {
      return 0;
    }
    int h = 0;
    for (Box b : boxes) {
      h += b.height;
    }
    return h;
  }
public static ArrayList<Box> createStack(Box[] boxes, Box bottom, HashMap<Box,ArrayList<Box>> stack_map){
  if(bottom!=null&&stack_map.containsKey(bottom)) 
    return stack_map.get(bottom);
  
  int max_height=0;
  ArrayList<Box> max_stack=null;
  for(int i=0;i<boxes.length;i++){
    if(boxes[i].canBeAbove(bottom)){
      ArrayList<Box> new_stack=createStack(boxes, boxes[i], stack_map);
      int new_height=stackHeight(new_stack);
      if(new_height>max_height){
        max_stack=new_stack;
        max_height=new_height;
      }
    }
  }
  if(max_stack==null) max_stack=new ArrayList<Box>();
  if(bottom!=null) max_stack.add(0,bottom);
  stack_map.put(bottom, max_stack);
  
  return (ArrayList<Box>)max_stack.clone();
}
}
