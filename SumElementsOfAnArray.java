/*
6. Write a method that takes as input a two-dimensional square array of integers. The
method should return the sum of the elements of the top-right to bottom-left diagonal.
Write a full program that tests the method.
*/
import java.util.*;
public class SumElementsOfAnArray{
  public static void main(String[] args){
    int[][] arrayTD = new int[3][3];
    int[][] arrayPopulated = populateArray(arrayTD);
    printArrayMatrix(arrayPopulated);
    System.out.println(sumOfDiagonal(arrayPopulated));
  }//end method main
  
  public static int sumOfDiagonal(int[][]  tDimArray){
    int totalSum = 0;
    for(int row = 0; row < tDimArray.length; row++){
      for(int col = 0; col < tDimArray[row].length; col++){
        if(col == row){
          totalSum += tDimArray[row][col];
        }//end if
      }//end for
    }//end for
    return totalSum;
  }//end method sumOfDiagonal
  
  public static int[][] populateArray(int[][] tDimArray){
    Scanner keyboard = new Scanner(System.in);
    for(int row = 0; row < tDimArray.length; row++){
      for(int col = 0; col < tDimArray[row].length; col++){
        System.out.println("Enter number for row at position: " + row + " and for column at position: " + col);
        tDimArray[row][col] = keyboard.nextInt();
      }//end for
    }//end for
    return tDimArray;
  }//end method populateArray
  
  public static void printArrayMatrix(int[][] arrayToPrint){
    for(int row = 0; row < arrayToPrint.length; row++){
      for(int col = 0; col < arrayToPrint[row].length; col++){
        System.out.print(arrayToPrint[row][col] + "\t");
      }//end for
      System.out.println();
    }//end for
  }//end method printArrayMatrix
}//end class SumElementsOfAnArray