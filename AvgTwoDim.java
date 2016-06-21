/*Write a method that takes as input a two-dimensional array of integers. The method
should return a one-dimensional array of elements of type double that contains the
average for each row. Write a full program that tests the method.*/
public class AvgTwoDim{
  public static void main(String[] args){
    int[][] array = new int[][]{{1}, {1,2}, {1,2,3}, {1}};
    double[] avgArray = avg(array);
    for(int i = 0; i < avgArray.length; i++){
      System.out.println("Avg at row: " + i + " : " + avgArray[i]);
    }//end for
  }//end method main
  
  public static double[] avg(int[][] array){
    double[] avgArray = new double[array.length];;
    for(int row = 0; row < array.length; row++){
      int sum = 0;
      int numCount = 0;
      for(int col = 0; col < array[row].length; col++){
        numCount++;
        sum += array[row][col];
      }//end for
      avgArray[row] = (double)sum / numCount;
    }//end for
    return avgArray;
  }//end method avg
}//end class AvgTwoDim