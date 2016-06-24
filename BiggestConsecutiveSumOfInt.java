/*For example, if the input array is {3,6,5,2,6}, then the output
array should be: {3,6,5} because 3+6+5=14, which is bigger than 6+5+2=13 and
5+2+6=13.
*/
import java.util.*;
public class BiggestConsecutiveSumOfInt{
  public static final int LENGTH_ARRAY_RETURNED = 3;
  public static void main(String args[]){
    int[] array = sumOfArrays(new int[]{3,6,5,2,60});
    for(int i:array){
      System.out.print(i);
    }//end fot
  }//end method main
  
  public static int[] sumOfArrays(int[] array){
    int sumArray = 0;//sum array elements from the 0 position forward
    int[]shoppedArray;
    int[] sumReturnedArray = new int[LENGTH_ARRAY_RETURNED];
    int sumCompArray = 0;//sum array elements from the 1 position forward
    int i = array.length;//flag variable to control the while cycle
    int counter = 0;//flag variable to know from where the for will start iterate trhough the array[]
    int copyArrayLength = 0;//variable used to get the start position from where the sumReturnedArray will start copying
    while(i != 0){
      //control that sum only 3 elements of the array
      if(array.length - counter <= 2){
         break;
      }//end if
      sumArray = 0;
      for(int j = 0;j < LENGTH_ARRAY_RETURNED; j++){
        sumArray += array[counter];
        if(sumArray > sumCompArray && j == 2){
          System.arraycopy(array, copyArrayLength, sumReturnedArray, 0,LENGTH_ARRAY_RETURNED);
       }//end if
       counter++;
      }//end for
      counter = counter-2;
      copyArrayLength = counter;
      //control that sum only 3 elements of the array
      if(array.length - counter <= 2){
         break;
      }//end if
      sumCompArray = 0;
      for(int k = 0; k < LENGTH_ARRAY_RETURNED; k++){
        sumCompArray += array[counter];
        if(sumArray < sumCompArray && k == 2){
          System.arraycopy(array, copyArrayLength, sumReturnedArray, 0,LENGTH_ARRAY_RETURNED);
        }//end if
        counter++;
      }//end for
      counter = counter-2;
      copyArrayLength = counter;
      i--;
    }//end for
    shoppedArray = Arrays.copyOf(sumReturnedArray, LENGTH_ARRAY_RETURNED);
    return shoppedArray;
  }//end method sumOfArrays
}//end class BiggestConsecutiveSumOfInt