import java.text.*;
import java.util.*;
public class TradingGame{
  static final int NUMBER_OF_DAYS = 10;
  static final double BASE_PRICE = 10;
  static final double VARIATION = 5;
  static final double INITIAL_CASH = 100;
  
  static double cash = INITIAL_CASH;
  static int appleInventory = 0;
  static int pearInventory = 0;
  static double applePrice, pearPrice;
  
  public static void main(String[] args){
    for(int day = 1; day <= NUMBER_OF_DAYS; day++){
      applePrice = computePrice(BASE_PRICE, VARIATION);
      pearPrice =  computePrice(BASE_PRICE, VARIATION);
      System.out.println("Day: " + day + " out of " + NUMBER_OF_DAYS);
      int choice;
      do{
        printMenu();
        choice = getChoice();
        switch(choice){
          case 1: // Print cash balance and inventory
            System.out.println("Cash: " + currencyFormatter(cash));
            System.out.println("Apple inventory: " + appleInventory);
            System.out.println("Pear inventory: " + pearInventory);
            break;
          case 2: 
            System.out.println("Price of apples is: " + currencyFormatter(applePrice));
            System.out.println("Price of pear is: " + currencyFormatter(pearPrice));
        }//end switch
      }while(choice != 7);//end do-while loop
    }//end for loop
  }
  
  public static double computePrice(double basePrice, double variation){
    double result =  basePrice;
    if(Math.random() > 0.5){
      result += Math.random() * variation;
    }else{
      result -= Math.random() * variation;
    }
    return ((int)(result * 100))/100.0;
  }//end method computePrice
  
  public static void printMenu(){
    System.out.println( "1. Print cash balance and inventory" ) ;
    System.out.println( "2. Print today's prices" ) ;
    System.out.println( "3. Buy apples" ) ;
    System.out.println( "4. Sell apples" ) ;
    System.out.println( "5. Buy pears" ) ;
    System.out.println( "6. Sell pears" ) ;
    System.out.println( "7. I am done for today") ;
  }//end method printMenu
  
  public static int getChoice(){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    do{
      System.out.print("Your choice: ");
      choice = keyboard.nextInt();
    }while(choice > 7 || choice < 0);
    return choice;
  }//end method getChoice
  
  public static String currencyFormatter(double amount){
    DecimalFormat myFomatter = new DecimalFormat("$### ,###.00");
    return myFomatter.format(amount);
  }//end method currencyFormatter
}