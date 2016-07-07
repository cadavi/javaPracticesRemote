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
    
    System.out.println("Bigger: " + secLargestDouble(aL));
  }//end main method
  
  public static Double secLargestDouble(ArrayList<Double> a){
    double largestD =  a.get(0);
    double aux;
    double sL = a.get(1);
    //largest
    for(int i = 0; i < a.size(); i++){
      if(a.get(i) > largestD ){
        largestD = a.get(i);
      }//end if
    }//end for
    return largestD;
  }//end method secLargestDouble
}//enc class SecondLargestNumberAL