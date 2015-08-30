package chapter1;

public class Code1_7 {
  public static void main(String[] args){
    int intArray[][]={{1,2,3,4,0},{12,13,0,14,5},{11,16,15,6,3},{10,9,8,7,67},{10,9,8,7,67},}; 
    System.out.println("The original Matrix is:"); 
    displayMatrix(intArray);
    
    System.out.println("After set 0:"); 
    displayMatrix(setZero(intArray));
      }
  
  private static int[][] setZero(int[][] intArray) {
    // TODO Auto-generated method stub
    int len1=intArray.length;
    int len2=intArray[0].length;
    boolean[] hang=new boolean[len1];
    boolean[] lie=new boolean[len2];

    for(int i=0;i<len1;i++){
      for(int j=0;j<len2;j++){
        if(intArray[i][j]==0){
          hang[i]=true;
          lie[j]=true;
//          System.out.println(hang);
//          System.out.println(lie);
        }
      }
    }
    for(int i=0;i<len1;i++){
      for(int j=0;j<len2;j++){
        if(hang[i]||lie[j]){
          intArray[i][j]=0;
        }         
      }
      }
    return intArray;
  }

  static void displayMatrix(int matrix[][]){
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++)
        {
        System.out.print(matrix[i][j]+" ");
        }
      System.out.println(); 
  }
  }
}
