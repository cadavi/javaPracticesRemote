import java.util.*;
public class SecondLargestNumberAL{
  public static void main(String[] args){
    ArrayList<Double> aL = new ArrayList<Double>();
    aL.add(1.0);
    aL.add(2.0);
    aL.add(8.0);
    aL.add(1.0);
    aL.add(5.0);
    aL.add(12.0);
    aL.add(0.0);
    
    for(Double d:aL){
      System.out.println(d);
    }//end for
    
    System.out.println("Second largest in the list: " + secLargestDouble(aL));
  }//end main method
  
  public static Double secLargestDouble(ArrayList<Double> a){
    double largestD =  a.get(0);
    double aux;
    //largest
    for(int i = 0; i < a.size(); i++){
      if(a.get(i) > largestD ){
        largestD = a.get(i);
      }//end if
    }//end for
    
    //delete the largest
    a.remove(new Double(largestD));
    //at this point the largest number is removed from the ArrayList,
    //so, we will search for the new largest(that is, the second largest).
    largestD =  a.get(0);
    for(Double d : a){
      if(d > largestD ){
        largestD = d;
      }//end if
    }//end for
    return largestD;
  }//end method secLargestDouble
}//enc class SecondLargestNumberAL