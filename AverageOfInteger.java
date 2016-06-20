/*
Write a method that takes as input a variable number of integers. The method should
return the average of the integers as a double.Write a full program to test the method.
 */
public class AverageOfInteger{
  public static void main(String[] args){
    System.out.print("Average: " + average(5,2));
  }//end method main
  
  public static double average(int ... numbers){
    double avg;
    int sum = 0;
    int count = 0;
    for(int i:numbers){
      sum += i;
      count++;
    }//end for
    avg = (double)sum / count;
    return avg;
  }//end method average
}//end class AverageOfInteger