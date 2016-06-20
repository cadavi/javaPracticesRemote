/*
Write a method that takes as input a string and returns the array of characters
that compose the string. Write a full program to test the method.
 */
import java.util.*;
public class ArrayOfCharacters{
  public static void main(String[] args){
    System.out.println("Array of characters");
    char[] stringToChar = arrayOrChars("davi");
    printArray(stringToChar);
  }//end method main
  
  public static char[] arrayOrChars(String string){
    char[] arrayOfStr = new char[string.length()];
    
    for(int i = 0; i < arrayOfStr.length; i++){
      arrayOfStr[i] = string.charAt(i);
    }//end for
    return arrayOfStr;
  }//end method arrayOrChars
  
  public static void printArray(char[] arrayToPrint){
    for(char e1:arrayToPrint){
      System.out.println(e1);
    }//end for
  }//end method printArray
}//class ArrayOfCharacters