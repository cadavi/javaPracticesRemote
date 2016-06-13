import java.util.*;
public class SalesTax{
  public static void main(String args[]){
    System.out.print("Enter the price of the item: ");
    Scanner keyboard = new Scanner(System.in);
    double saleTax = keyboard.nextDouble();  
    System.out.print("Tax: " + calSaleTax(saleTax));
  }
  
  public static double calSaleTax(double priceOfItem){
    final double SALE_TAX = 0.7;
    double result = priceOfItem * SALE_TAX;
    return result;
  }
}