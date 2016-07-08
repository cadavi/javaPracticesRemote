/*
Write a method that takes in an ArrayList of Integer and an integer and returns
true if the integer is in the ArrayList and false otherwise.
 */
import java.util.*;
public class IsIn{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int listValues;
    int intToSearch;
    ArrayList<Integer> aL = new ArrayList<Integer>();
    do{
      System.out.println("Enter the values for the list");
      listValues = keyboard.nextInt();
      if(listValues == 0){
        break;
      }//end if
      aL.add(listValues);
    }while(listValues!=0);
    System.out.println("Value to search in the list");
    intToSearch = keyboard.nextInt();
    System.out.println("The integer " + intToSearch + " is in the list? "+ isIntegerIn(aL, intToSearch));
  }//end method main
  
  public static boolean isIntegerIn(ArrayList<Integer> arrayLNumn, int num){
    for(int i = 0; i < arrayLNumn.size(); i++){
      if(arrayLNumn.get(i) == num){
        return true;
      }//end if
    }//end for
    return false;
  }//end method isIntegerIn
}//end class IsIn