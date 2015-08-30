package chapter1;

public class Code1_6 {
  public static void main(String[] args){
  int intArray[][]={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7},}; 
  System.out.println("The original Matrix is:"); 
  displayMatrix(intArray);
  
  System.out.println("After reverse 90 degree:"); 
  displayMatrix(reverseNinety(intArray));
    }

  private static int[][] reverseNinety(int[][] intArray) {
    // TODO Auto-generated method stub
    int temp1=0;
    int temp2[]={0,0,0,0,};
    for(int i=0;i<4;i++){
      for(int j=0;j<=i;j++){
      temp1=intArray[i][j];
      intArray[i][j]=intArray[j][i];
      intArray[j][i]=temp1;
      }
    }
    
    for(int i=0;i<2;i++){
      for(int j=0;j<4;j++){
        temp2[j]=intArray[i][j];
        intArray[i][j]=intArray[3-i][j];
        intArray[3-i][j]=temp2[j];
      }
    }
    return intArray;
      }

  static void displayMatrix(int matrix[][]){
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++)
        {
        System.out.print(matrix[i][j]+" ");
        }
      System.out.println(); 
  }
}
}
