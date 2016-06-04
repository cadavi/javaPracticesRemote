import java.util.*;
public class Factorial{
  public static void main(String args[]){
    System.out.print("Enter the number: ");
    Scanner keyboard = new Scanner(System.in);
    long input = keyboard.nextLong();
    long result = 1;
    for(long i = 1;  i <= input; i++){
      result = i * result;
    }
    System.out.print(result);
  }
}