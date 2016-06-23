/*Write a method that takes as input an array of integers and returns an array of
three integers. You can assume that the input array contains at least three elements.
The returned array should contain the three consecutive elements in the input array
with the biggest sum. For example, if the input array is {3,6,5,2,6}, then the output
array should be: {3,6,5} because 3+6+5=14, which is bigger than 6+5+2=13 and
5+2+6=13. Write a full program that tests the method.*/
public class ArrayOfThreeIntegers{
  public static void main(String[] args){
    int[] getArray = sumOfArray(new int[]{3,6,5,5,7,3});
    int maxSum = getArray[0];
    for(int i:getArray){
      if(maxSum < i){
        maxSum = i;
      }//end if
      System.out.println(i);
    }//end for
  }//end method main
  
  public static int[] sumOfArray(int[] array){
    final int NUMBER_OF_ELEMENTS = array.length;
    int sumArray = array[0]+array[1]+array[2];
    int sum = 0;
    int[] positionArray  = new int[NUMBER_OF_ELEMENTS];
    for(int i = 0; i < array.length; i++){
      int counter = 0;
      sum = array[1];
      for(int j = i + 2; j < array.length; j++){
        counter++;
        //System.out.println("Sum: " + sum + " " +array[j]);
        System.out.println("Sum of array: " + sumArray);
        System.out.println("another sum: " + sum);
        sum += array[j];
        if(sumArray < sum){
          sumArray = array[j] + array[i+1];
        }//end if
        if(counter == 2){
          break;
        }//end if
      }//end for
      //sumArray[i] = i;
    }//end for
    return array;
  }//end method sumOfArray
}//end class ArrayOfThreeIntegers