/*Write a method that tests if the two-dimensional array that is specified as a parameter
is ragged. Write a full program that tests the method.*/
import java.util.*;
public class RaggedArray{
  public static void main(String[] args){
    int[][] ragged  = new int[][]{{1,2,3}, {1,4,6}, {1,7,8}};
    boolean isRagged = isRagged(ragged);
    System.out.print("Is ragged? " + isRagged);
  }//end method main
  
  public static boolean isRagged(int[][] array){
    int countRagged = 0;
    boolean ragged;
    for(int row = 0; row < array.length; row++){
        if(array[row].length != array.length){
          countRagged++;
        }//end if
    }//end for
    ragged = (countRagged > 0 ? true : false);
    return ragged;
  }//end method 
}//end class RaggedArray