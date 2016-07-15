/*
Write a method that takes as input an ArrayList of integers. The methods should
reverse the elements and have void return type
*/
import java.util.*;
public class ReverseElements{
  public static void main(String[] args){
    ArrayList<Integer> aL = new ArrayList<Integer>();
    aL.add(0);
    aL.add(10);
    aL.add(20);
    aL.add(30);
    aL.add(40);
    aL.add(50);
    aL.add(60);
    aL.add(70);
    aL.add(80);
    reverseAL(aL);
  }//end main method
  
  public static void reverseAL(ArrayList<Integer> arrayList){
    int aux;
    for(int i = 0, lastRecord = arrayList.size() - 1;
        i < (arrayList.size()/2); i++, lastRecord--){
      aux = arrayList.get(lastRecord);
      arrayList.set(lastRecord, new Integer(arrayList.get(i)));
      arrayList.set(i, aux);
    }//end for
    System.out.println(arrayList);
  }//end method reverseAL
}//end class ReverseElements