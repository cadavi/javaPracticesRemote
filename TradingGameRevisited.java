import java.text.*;
import java.util.*;
public class TradingGameRevisited{
  static final int NUMBER_OF_DAYS = 10;
  static final double BASE_PRICE = 10;
  static final double VARIATION = 5;
  static final double INITIAL_CASH = 100;
  
  static final int ITEM_COUNT = 2;
  static final String[] item = new String[]{"apples","pears"};
  static double price[] = new double[ITEM_COUNT]; 
  static int inventory[] = new int[ITEM_COUNT];
  static double cash = INITIAL_CASH;
  
  public static void main(String[] args){
    for(int day = 1; day < NUMBER_OF_DAYS; day++){
      for(int i = 0; i < ITEM_COUNT; i++){
        price[i] = computePrice(BASE_PRICE, VARIATION);
      }
      System.out.println("Day: " + day + " out of " + NUMBER_OF_DAYS);
      int choice;
      printMenu();
      do{
        choice = getChoice();
        switch(choice){
          case 1: // Print cash balance and inventory
            System.out.println("Cash: " + currencyFormatter(cash));
            for(int i = 0; i < ITEM_COUNT; i++){
              System.out.println(item[i] + " inventory " + inventory[i] + 
                                 " price " + currencyFormatter(price[i]));
            }//end for
            break;
            
          case 2:{// Buy product
            int itemID = getProductId();
            int amount = getQuantity(item[itemID], "buy");
            if(!buy(itemID, amount)){
              System.out.println("You don't have enough money");
            }
            break;
          }//end case 2
          
          case 3:{
            int itemID = getProductId();
            int amount = getQuantity(item[itemID], "sell");
            if(!sell(itemID, amount)){
              System.out.println("You don't have enough " + item[itemID]);
            }
            break;
          }//end case 3
        }//end switch
      }while(choice != 4);//end do-while
    }//end for
    System.out.println( "You finished with:" + currencyFormatter(cash));
  }//end main method
  
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
    System.out.println("1. Print cash balance , inventory , and prices");
    System.out.println("2. Buy product");
    System.out.println("2. Sell product");
    System.out.println("4. I am done for today");
  }//end method printMenu
  
  public static int getChoice(){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    do{
      System.out.print("Your choice: ");
      choice = keyboard.nextInt();
    }while(choice > 4 || choice < 0);
    return choice;
  }//end method getChoice
  
  public static String currencyFormatter(double amount){
    DecimalFormat myFomatter = new DecimalFormat("$### ,###.00");
    return myFomatter.format(amount);
  }//end method currencyFormatter
  
  public static int getProductId(){
    String s;
    System.out.print("Enter the product name: ");
    Scanner keyboard = new Scanner(System.in);
    while(true){
      s = keyboard.next();
      for(int i =0; i < item.length; i++){
        if(item[i].equals(s)){
          return i;
        }//end if
      }//end for
    }//end while
  }//end method getProductId
  
  public static int getQuantity(String product, String action){
    System.out.print("How many " + product + " do you want to " + action + " ?");
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextInt();
  }//end method getQuantity
  
  public static boolean sell(int itemId, int amount){
    if(amount > inventory[itemId]){
      return false;
    }
    cash += amount * price[itemId];
    inventory[itemId] -= amount;
    return true;
  }//end sell method
  
  public static boolean buy(int itemId, int amount){
    if(amount * price[itemId] < cash){
      cash -= amount * price[itemId];
      inventory[itemId] += amount;
      return true;
    }
    return false;
  }//end method buy
}