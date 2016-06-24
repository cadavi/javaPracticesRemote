/*For example, if the input array is {3,6,5,2,6}, then the output
array should be: {3,6,5} because 3+6+5=14, which is bigger than 6+5+2=13 and
5+2+6=13.
*/
import java.util.*;
public class BiggestConsecutiveSumOfInt{
  public static void main(String args[]){
    int[] array = sumOfArrays(new int[]{3,6,5,2,6});
    for(int i:array){
      System.out.print(i);
    }//end fot
  }//end method main
  
  public static int[] sumOfArrays(int[] array){
    int sumArray = 0;
    int[] sumReturnedArray = new int[3];
    int sumCompArray = 0;
    int i = array.length;
    int counter = 0;
    while(i != 0){
      //control that sum only 3 elements of the array
      if(array.length - counter <= 2){
         break;
      }//end if
      for(int j = 0;j < 3; j++){
        sumArray += array[counter];
        System.out.println("Value: " + array[counter] + " sum: " + sumArray);
 
       if(sumArray > sumCompArray && j == 2){
          System.arraycopy(array, 0, sumReturnedArray, 0,3);
          System.out.println("sumArray: " + sumArray + " sumCompArray " + sumCompArray);
       }//end if
       counter++;
      }//end for
      counter = counter-2;
      System.out.println("------------------------------------------" + counter);
      //control that sum only 3 elements of the array
      if(array.length - counter <= 2){
         break;
      }//end if
      for(int k = 0; k < 3; k++){
        sumCompArray += array[counter];
        System.out.println("Value of other: " + array[counter] + " sum: " + sumCompArray);
        counter++;
      }//end for
      counter = counter-2;
      //check the biggest sum
      /*if(sumArray > sumCompArray){
        System.arraycopy(array, 1, sumReturnedArray, 0,3);
        System.out.println("sumArray: " + sumArray + " sumCompArray " + sumCompArray);
      }//end if*/
      System.out.println("------------------------------------------" + counter);
      sumArray = 0;
      sumCompArray = 0;
      i--;
    }//end for
    return sumReturnedArray;
  }//end method sumOfArrays
}//end class BiggestConsecutiveSumOfInt