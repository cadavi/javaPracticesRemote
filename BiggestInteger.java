/*Write a method that takes as input a two-dimensional array of integers. The method
should return the biggest integer in the array. Write a full program that tests the
method.
*/
public class BiggestInteger{
  public static void main(String[] args){
    System.out.print("The biggest number in the two-dimensional array is: " 
                       + biggestInt(new int[][]{{11,2, 3}, {4,5,6}, {7,1,0}}));
  }//end method main
  
  public static int biggestInt(int[][] array){
    int biggestInt = array[0][0];
    for(int row = 0; row < array.length; row++){
      for(int col = 0; col < array[row].length; col++){
        if(biggestInt < array[row][col]){
          biggestInt = array[row][col];
        }//end if
      }//end for
    }//end for
    return biggestInt;
  }//end method biggestInt
}//end class BiggestInteger