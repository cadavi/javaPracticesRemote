/*Write a method that takes as input an ArrayList of doubles. The method should
return an ArrayList of the doubles that are at even positions (i.e., position 0, 2, 4,
and so on).*/
import java.util.*;
public class Even2Positions{
  public static void main(String[] args){
    ArrayList<Double> aL = new ArrayList<Double>();
    even2Positions(aL);
    
    for(Double i:aL){
      System.out.println(i);
    }//end for
  }//end main method
  
  public static ArrayList<Double> even2Positions(ArrayList<Double> arrayList){
    for(int i = 0; i < 103; i+=2){
      arrayList.add(i+0.0);
    }//end for
    return arrayList;
  }//end method event2Positions
}//end class Even2Positions