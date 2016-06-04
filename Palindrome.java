import java.util.*;
public class Palindrome{
  public static void main(String args[]){
    System.out.print("Enter the word: ");
    Scanner keyboard = new Scanner(System.in);
    String letter = keyboard.next();
    char forward;
    String forwardToString;
    char backwards;
    String backwardsToString;
    int end = letter.length();
    boolean isPalindrome = true;
    for(int i =0 ; i < letter.length(); i++){
      forward = letter.charAt(i);
      forwardToString = String.valueOf(forward);//Convert char to String
      --end;
      backwards =  letter.charAt(end);
      backwardsToString = String.valueOf(backwards);//Convert char to String
         if (forwardToString.compareTo(backwardsToString) != 0){
             isPalindrome = false;
             break;
        }
      }
      if(isPalindrome == true){
         System.out.println("The string is palindrome");
      }else{
         System.out.println("The string is NOT palindrome");
      }
    }
  }