import java.util.*;
public class AverageOfThree{
  public static void main(String args[]){
    System.out.print("Enter the first number: ");
    int number1 =  input();
    System.out.print("Enter the second number: ");
    int number2 =  input();
    System.out.print("Enter the third number: ");
    int number3 = input();
    double avg = average(number1, number2, number3);
    System.out.print("The average is: " + avg);
  }
  
  public static double average(int number1, int number2, int number3){
    return (number1 + number2 + number3) / 3;
  }
  
  public static int input(){
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextInt();
  }
    
}