/*Write a method that takes as input an array of integers and returns an array of
three integers. You can assume that the input array contains at least three elements.
The returned array should contain the three consecutive elements in the input array
with the biggest sum. For example, if the input array is {3,6,5,2,6}, then the output
array should be: {3,6,5} because 3+6+5=14, which is bigger than 6+5+2=13 and
5+2+6=13. Write a full program that tests the method.*/
public class ArrayOfThreeIntegers{
  public static int[] savedPosition;
  public static void main(String[] args){
    int[] getArray = sumOfArray(new int[]{3,6,5,2,6});
    for(int i:getArray){
      System.out.println(i);
    }//end for
    System.out.println("Hola soy ArrayOfThreeIntegers");
    for(int i : savedPosition){
      System.out.println(i);
    }//end for
  }//end method main
  
  public static int[] sumOfArray(int[] array){
    final int NUMBER_OF_ELEMENTS = array.length;
    savedPosition = new int[NUMBER_OF_ELEMENTS];
    int sum = 0;
    int[] sumArray = new int[NUMBER_OF_ELEMENTS];
    for(int i = 0; i < array.length; i++){
      sum = array[i];
      int counter = 0;
      for(int j = i + 1; j < array.length; j++){
        sum +=  array[j];
        counter++;
        if(counter == 2){
          break;
        }//end if
      }//end for
      savedPosition[i] = array[i];
      sumArray[i] = sum;
    }//end for
    return sumArray;
  }//end method sumOfArray
}//end class ArrayOfThreeIntegers