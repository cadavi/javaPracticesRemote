/*Write a method that takes as input an array of integers. The method should reverse
the array. Write a full program that tests the method.
*/
public class ReverseTheArray{
  public static void main(String[] args){
    int[] array = new int[]{1,2,3,4,8,10,20,55,60};
    System.out.print("Original array: ");
    for(int i : array){
      System.out.print(i + " ");
    }//end for
    
    int[] reversedArray = reverseArray(array);
    System.out.println();
    System.out.print("Reversed array: ");
    for(int i : reversedArray){
      System.out.print(i + " ");
    }//end for
  }//end method main
  
  public static int[] reverseArray(int[] array){
    int aux = array[0];
    int[] reverArray = new int[array.length];
    int countCicle = 0;
    for(int i = 0; i < array.length ; i++){
       countCicle++;
       reverArray[i] = array[array.length - countCicle];
    }//end for
    return reverArray;
  }//end method reverseArray
}//end class ReverseTheArray