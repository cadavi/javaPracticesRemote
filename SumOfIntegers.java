import java.util.*;
public class SumOfIntegers{
  public static void main(String args[]){
    System.out.print("Enter the number to sum: ");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    System.out.print("The total of the sum is: " + sumNNumbers(number));
  }
  
  public static int sumNNumbers(int number){
    int total = number;
    for(int i = 1; i < number; i++){
      total += i;
    }
    return total;
  }
}