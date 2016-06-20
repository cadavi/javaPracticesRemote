/*
Write a method that takes as input an array of strings and returns the longest string.
Write a full program to test the method. Remember that s.length() will return the
length of the string s.
*/
import java.util.*;
public class LongestStringInArray{
  
  public static void main(String[] args){
    String[] arrayOfStrings = new String[]{"c", "medinasss", "mendez"};
    System.out.print("The longest string is: " + longestString(arrayOfStrings));
  }//end method main
  
  public static String longestString(String[] stringArray){
    String longString = stringArray[0];
    for(int i = 0; i < stringArray.length; i++){
      if(stringArray[i].length() > longString.length()){
        longString = stringArray[i];
      }//end if
    }//end for
    return longString;
  }//end method longestString
}