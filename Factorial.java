import java.util.*;
public class Factorial{
  public static void main(String args[]){
    System.out.print("Enter the number: ");
    Scanner keyboard = new Scanner(System.in);
    long input = keyboard.nextLong();
    long j;
    long multiply = 1;
    long result = 0;
    String character = " x ";
    long temp = 0;
    for(long i = input;  i > 0; i--){
      j = i - 1;
      temp *= j;
      multiply = i * j;
      temp = multiply;
      //multiply *= (j - 1);
      //result = multiply  * (j - 2);
      if(i == 2){
        character = " = " + result;
      }
      System.out.println("Resultado: " + temp);
      //System.out.print(i + character);
    }
  }
}