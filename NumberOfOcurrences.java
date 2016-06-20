/*
 Write a method that finds the number of occurrences of the integer specified as the
first parameter in the array of integers that is specified as the second parameter. Write
a full program to test the method.
*/
import java.util.*;
public class NumberOfOcurrences{
  public static void main(String[] args){
    System.out.print("Numbers or ocurrences: " + 
                     numOfOcurrences(1, new int[]{1,1,1,5,6,7,8,9}));
  }//end main method
  
  public static int numOfOcurrences(int numberToSearch,
                                    int[] arrayOfInt){
    int totalOfOcurrences = 0;
    for(int e1 : arrayOfInt){
      if(e1 == numberToSearch){
        totalOfOcurrences++;
      }//end if
    }//end for
    return totalOfOcurrences;
  }//end method numOfOcurrences
}//end class NumberOfOcurrences