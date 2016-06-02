/*
Write a program that reads an integer. If the integer is between 1 and 4, then the
program should print one, two, three, or four, respectively. If the integer is not
between 1 and 4, then the program should print Number not between one and four.
Use a switch statement.
*/
import java.util.*;
public class SwitchStatement{
  public static void main(String args[]){
    System.out.print("Enter a integer:");
    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();
    String msg;
    switch(input){
      case 1:
        msg = "one";
        break;
      case 2: 
        msg = "two";
        break;
      case 3:
        msg = "three";
        break;
      case 4:
        msg = "four";
        break;
      default:
        msg = "Number not between one and four.";
    }
    System.out.println(msg);
  }
}