/*Write a program that reads two integers from the keyboard and prints their average.
Do not forget that dividing two integers always returns an integer.*/
import java.util.*;
import java.math.*;
  
public class Average{
  public static void main(String args[]){
    
    System.out.println("Introduzca los dos numeros que deseas conocer su promedio");
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    
    int num1 = input1.nextInt();
    int num2 = input2.nextInt();
    
    double average = (double)(num1 + num2)/2;
    System.out.println("Average from sum of: " + num1 + " + " + num2 + " = " + average);
    
  }
}