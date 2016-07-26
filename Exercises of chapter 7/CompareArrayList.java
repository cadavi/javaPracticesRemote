/*
Write a method that takes as input two ArrayLists of integers. The method should
return true when the ArrayLists have at least one element in common and false
otherwise.
 */
import java.util.*;
public class CompareArrayList{
  public static void main(String[] args){
    ArrayList<Integer> aL1 = new ArrayList<Integer>();
    aL1.add(10);
    aL1.add(20);
    aL1.add(30);
    aL1.add(40);
    aL1.add(50);
    aL1.add(60);
    aL1.add(70);
    aL1.add(80);
    
    ArrayList<Integer> aL2 = new ArrayList<Integer>();
    aL2.add(10+1);
    aL2.add(20+1);
    aL2.add(30+1);
    aL2.add(40+1);
    aL2.add(500);
    aL2.add(60+1);
    aL2.add(70+1);
    aL2.add(50);
    System.out.print("There's elements in common? " + isThere(aL1, aL2));
  }//end main method main
  
  public static boolean isThere(ArrayList<Integer> list1, ArrayList<Integer> list2){
    for(Integer i:list1){
      for(Integer j:list2){
        if(i == j){
          return true;
        }//end if
      }//end for
    }//end for
    return false;
  }//end methodisThere
}//end class CompareArrayList