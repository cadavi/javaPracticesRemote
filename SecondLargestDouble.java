/*Write a method that takes as input an array of doubles. The method should return
the second largest double in the array. Write a full program that tests the method.
*/
import java.util.*;
public class SecondLargestDouble{
  public static void main(String[] args){
    System.out.print("Find the sencond smallest number for the following array: ");
    double[] array = new double[]{1,20,35,4,5};
    double secondLargest;
    for(int i = 0; i < array.length; i++){
      System.out.print(" " + array[i]);
    }//end for
    
    secondLargest = secondLargestDouble(array);
    System.out.print("\n The 2nd largest double is: " + secondLargest);
  }//end method main
  
  public static double secondLargestDouble(double[] array){
    double smallest = array[0];
    for(int i = 0; i < array.length; i++){
      if(smallest > array[i]){
        smallest = array[i];
      }//end if
    }//end for
    array[0]  = smallest;//change the value of the array at position 0, to be the smallest
    double secondSmallest = array[1];
    //search for the smallest(2nd smallest) that follows the smallest(1er smallest)
    for(int i = 1; i < array.length - 1; i++){
      if(secondSmallest > array[i]){
        secondSmallest = array[i];
      }//end if
    }//end for
    return secondSmallest;
  }//end method secondLargestDouble
}//end class SecondLargestDouble