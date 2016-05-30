/*
Write a program that prints two random integers (smaller than 100 and bigger than 0). 
The program should ask the user to multiply the numbers and read the result
from the user. If the user has done the multiplication correctly, then the program
should print “Congratulations!” Otherwise, the program should print “Better luck
next time.” */
import java.util.*;
public class Multiply{
  public static void main(String args[]){
    int x = (int)(Math.random()*100);
    int y = (int)(Math.random()*100);
    System.out.println("Which is the result of the following operation: " + x + " * " + y);
    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();
    String msg = (input == x * y) ? "Congratulations!":"Better luck next time.";
    System.out.println(msg);
  }
}