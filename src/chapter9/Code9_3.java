package chapter9;

public class Code9_3 {
  public static void main(String[] args) {
    int array[]={-40,-20,-1,1,2,3,5,8,9,12,13};
    //int array[]=null;
    int index=magicIndex(array);
    if(index==-1){
    System.out.println("Error!");
    } else{
      if(index==-2){
        System.out.println("No!");
        } else System.out.println("The magic index is "+magicIndex(array)); 
    }
  }
  static int magicIndex(int[] array) {
    // TODO Auto-generated method stub
    if(array==null) return -1;
    else return magicIndex(array,0,array.length-1);
  }
  
  static int magicIndex(int[] array, int start, int end) {
    // TODO Auto-generated method stub
    int mid=(start+end)/2;
    if(start>end||start<0||end>array.length) return -2;
    if(array[mid]==mid) return mid;
    if(array[mid]<mid) return magicIndex(array,mid+1,end);
    else return magicIndex(array,start,mid-1);
  }
  
 
  
}
