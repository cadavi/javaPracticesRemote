/*
Write a program that reads two strings from the keyboard and prints the largest
(relative to lexicographical order). Use the compareTo method to compare the strings.*/
import java.util.*;
public class LargestString{
  public static void main(String args[]){
    System.out.print("Enter the first letter");
    Scanner keyboard = new Scanner(System.in);
    String letter1 = keyboard.next();
    System.out.print("Enter the second letter");
    Scanner keyboard2 = new Scanner(System.in);
    String letter2 = keyboard2.next();
    
    if(letter1.compareTo(letter2) > 0){
      System.out.println("Largest: "+letter1);
    }else if(letter1.compareTo(letter2) < 0){
      System.out.println("Largest: "+letter2);
    }else{
      System.out.println("The letters are equals");
    }
  }
}