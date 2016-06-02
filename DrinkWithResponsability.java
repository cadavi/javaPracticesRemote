/*Write a program that checks if the user is underage. If they are, then the program
should tell them not to go to the bar. If they are over 21, then the program should
print that they are allowed to go to the bar, but they should drink responsibly.*/
import java.util.*;
public class DrinkWithResponsability{
  public static void main(String args[]){
    System.out.println("How old are you?");
    Scanner keyboard = new Scanner(System.in);
    int age = keyboard.nextInt();
    String msg = (age <= 21) ? "You are underage, go home!" : "Welcome, drink with responsability!";
    System.out.println(msg);
  }
}
