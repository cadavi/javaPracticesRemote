import java.util.*;
public class Palindrome{
  public static void main(String args[]){
    System.out.print("Enter the word: ");
    Scanner keyboard = new Scanner(System.in);
    String letter = keyboard.next();
    char forward;
    String forwardString;
    char backward;
    String backwardString;
    boolean isPalindrome = true;
    for(int i = 0, end = letter.length() - 1; i < letter.length(); ++i, --end){
        forward = letter.charAt(i);
        forwardString = String.valueOf(forward);
        backward = letter.charAt(end);
        backwardString = String.valueOf(backward);
        if(forwardString.compareTo(backwardString) != 0){
          isPalindrome = false;
          break;
        }
    }
    if(isPalindrome == true){
       System.out.println("The letter is palindrome");
    }else{
       System.out.println("The letter is NOT palindrome");
    }
  }
}