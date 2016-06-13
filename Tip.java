import java.util.*;
public class Tip{
  public static void main(String args[]){
    System.out.print("Enter the meal's price: ");
    Scanner keyboard = new Scanner(System.in);
    double input = keyboard.nextDouble();
    System.out.printf("The tip is: " + amountOfTip(input));
  }
  
  public static double amountOfTip(double priceOfMeal){
    double tipAmount;
    do{
       tipAmount = Math.random();
    }while(tipAmount < 0.10 || tipAmount > 0.20);
    return tipAmount * priceOfMeal;
  }
}