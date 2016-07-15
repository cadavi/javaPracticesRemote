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
    aL.add(20);//5 + 10 + 20 = 35
    aL.add(30);
    aL.add(40);
    aL.add(50);
    aL.add(60); 
    aL.add(70);
    aL.add(80); 
    aL.add(90);  
    biggestSum(aL);
    /*ArrayList<Integer> lastArrayList = biggestSum(aL);
    for(Integer i:lastArrayList){
      System.out.println(i);
    }*///end for
  }//end main method 
  
  public static ArrayList<Integer> biggestSum(ArrayList<Integer> arrayList){
    ArrayList<Integer> bigSum = new ArrayList<Integer>();
    Integer sumTotal = 0;
    int j = 0;
    for(int i = 0; i < arrayList.size()-1; i++){
      sumTotal += arrayList.get(i);
     if(j == 3){
        bigSum.add(sumTotal);
        j = 0;
        sumTotal = 0;
      }//end if
      j++;
     System.out.println(sumTotal);
    }//end for
    return bigSum;
  }//end method biggestSum
}//end class BiggestSum