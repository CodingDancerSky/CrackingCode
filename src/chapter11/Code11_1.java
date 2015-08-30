package chapter11;

import CtCILibrary.AssortedMethods;

public class Code11_1 {
  public static void main(String[] args) {
    int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
    int[] b = {1, 4, 6, 7, 7, 7};
    mergeAB(a, b, 8, 6);
    System.out.println(AssortedMethods.arrayToString(a));
  }
static void mergeAB(int[] arrayA,int[] arrayB,int lengthA,int lengthB){
  int indexA=lengthA-1;
  int indexB=lengthB-1;
  int index_AB=indexA+indexB+1;
  
  while(indexA>=0&&indexB>=0){
    if(arrayA[indexA]>arrayB[indexB]){
      arrayA[index_AB]=arrayA[indexA];
      indexA--;
      index_AB--;
    }else{
      arrayA[index_AB]=arrayB[indexB];
      indexB--;
      index_AB--;
    }
    
  }
  
  while(indexB>=0) {
    arrayA[index_AB]=arrayB[indexB];
    index_AB--;
    indexB--;
  }
  
}
}
