import java.util.*;
public class ConvertToBinary{
  public static void main(String args[]){
    System.out.print("Enter the number to convert: ");
    Scanner keyboard = new Scanner(System.in);
    boolean flag = true;
    final int DIVISOR = 2;
    int number = keyboard.nextInt();
    int product;
    int remainder;   
    do{
        product = number/DIVISOR;
        remainder = number%DIVISOR;
        number = product;
        System.out.print(+remainder);
        if((number == 1 && remainder == 0)
             || (number == 1 && remainder == 1)
             || (number == 0 && remainder == 0)){
          remainder = number;
          System.out.print(remainder);
          break;
        }
        }while(flag == true);
  }
}