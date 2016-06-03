import java.util.*;
public class ConvertToBinary{
  public static void main(String args[]){
    System.out.print("Enter the number to convert: ");
    Scanner keyboard = new Scanner(System.in);
    final int DIVISOR = 2;
    int number = keyboard.nextInt();
    int product;
    int remainder;   
    do{
      product = number/DIVISOR;
      remainder = number%DIVISOR;
      number = product;
      System.out.print("The product: "+number);
      System.out.println();
      ///System.out.println("The remainder: "+remainder);
      if(number == 1 && remainder == 0){
        break;
      }
    }while(true);
  }
}