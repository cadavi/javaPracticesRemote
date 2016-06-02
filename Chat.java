/*
Write a program that chats with you. If you type Hi, then the program should print
Hi and terminate. If you enter Bye, then the program should print Bye and terminate.
If you enter anything else, the program should respond And how do you feel about
this? and terminate. Use a switch statement.
 */
import java.util.*;
public class Chat{
  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.next();
    switch(input){
      case "Hi":
        System.out.println(input);
        break;
      case "Bye":
        System.out.println(input);
        break;
      default:
        System.out.println("And how do you feel about sthis?");
    }  
  }
}