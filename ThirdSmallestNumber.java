/*
 Write a method that takes as input an array of integers and returns the third smallest
number. Write a full program to test the method.
 */

public class ThirdSmallestNumber{
  public static void main(String args[]){
    int[] array = new int[]{3,5,48,171,10}; //i1 = {2,3,1}, i2 = {1, }
    System.out.print(thirdSmallestNum(array));
  }
  
  public static void orderedArray(int[] num){
    int auxiliar;
    for(int i = 0; i < num.length; i++){
      for(int j = 0; j < num.length - 1; j++){
        if (num[j] > num[j + 1]){
          auxiliar = num[j];//1ra = 3, 2nda = 
          num[j] = num[j + 1];//1ra = 2
          num[j + 1] = auxiliar;//1ra = 3, 2
        }//end if
      }//end for
    }//end for
  }//end method thirdSmallesNum
  
  public static int thirdSmallestNum(int[] intArray){
    orderedArray(intArray);
    int thirdSmallestN = 0;
    for(int i = 0; i <= intArray.length; i++){
      if( i == 2){
        return intArray[i];
      }//end if
    }//end for
    return thirdSmallestN;
  }//end method thirdSmallestNum
}