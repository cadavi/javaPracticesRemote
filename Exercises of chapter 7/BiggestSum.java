/*
Write a method that takes as input an ArrayList of integers. The methods should
return an ArrayList of integers that contains the three consecutive integers in the
input ArrayList with the biggest sum.
*/
import java.util.*;
public class BiggestSum{
  public static void main(String[] args){
    ArrayList<Integer> aL = new ArrayList<Integer>();
    aL.add(05); 
    aL.add(10); 
    aL.add(15);//05 + 10 + 15 = 30
    aL.add(20);//10 + 15 + 20 = 45
    aL.add(25);//15 + 20 + 25 = 60
    aL.add(30);//20 + 25 + 30 = 75
    aL.add(35);//25 + 30 + 35 = 90
    aL.add(40);//30 + 35 + 40 = 105
    showBiggestSum(aL);
  }//end main method 
  
  private static ArrayList<Integer> totalizedAL(ArrayList<Integer> arrayList){
    ArrayList<Integer> bigSum = new ArrayList<Integer>();
    int flag = 0;
    for(int i = 0; i < arrayList.size()- 2; i++){
      int sum = arrayList.get(i);
      for(int j = 1; j < 3; j++){
        sum += arrayList.get(j+i);
      }//end for
      bigSum.add(sum);
    }//end for
    return bigSum;
  }//end method biggestSum
  
  public static void showBiggestSum(ArrayList<Integer> arrayList){
    ArrayList<Integer> aL = totalizedAL(arrayList);
    int biggestSum = aL.get(0);
    for(int i = 1; i < aL.size(); i++){
      if(biggestSum < aL.get(i)){
        biggestSum = aL.get(i);
      }//end if
    }//end for
    System.out.print("Biggest sum: " + biggestSum);
  }//end method showBiggestSum
}//end class BiggestSum