/*
Modify the Trading Game and add two cities: NewYork and LosAngeles. The price of
apples and pears changes every day in both cities. The player can only buy or sell 
from one of the cities every day. Extend the game by adding inventory of apples and pears
for both cities. The inventory changes randomly every day. The player can only buy apples
or pears if there is sufficient inventory in the city. The goal of the game again is to make as
much money as possible after ten days. You are allowed to introduce new global variables as
needed. Try to create as many new methods as needed and follow good software engineering
practices.
 */
import java.text.*;
import java.util.*;
public class TradingGameExtended{
  static final int NUMBER_OF_DAYS = 10;
  static final double BASE_PRICE = 10;
  static final double VARIATION = 5;
  static final double INITIAL_CASH = 100;
  
  static double cash = INITIAL_CASH;
  static int appleInventoryNY = 0;
  static int pearInventoryNY = 0;
  static int appleInventoryLA = 0;
  static int pearInventoryLA= 0;
  static double applePrice, pearPrice;
  
  public static void main(String[] args){
    for(int day = 1; day <= NUMBER_OF_DAYS; day++){
      applePrice = computePrice(BASE_PRICE, VARIATION);
      pearPrice =  computePrice(BASE_PRICE, VARIATION);
      String city = getCityChoise();
      System.out.println("Day: " + day + " out of " + NUMBER_OF_DAYS + " in " + city);
      int choice;
      do{
        printMenu();
        choice = getChoice();
        switch(choice){
          case 1: // Print cash balance and inventory
            System.out.println("Cash: " + currencyFormatter(cash));
            System.out.println("Apple inventory in: " + getAppleInvetory(city));
            System.out.println("Pear inventory in: " + getPearInvetory(city));
            break;
          case 2: 
            System.out.println("Price of apples is: " + currencyFormatter(applePrice));
            System.out.println("Price of pear is: " + currencyFormatter(pearPrice));
            break;
          case 3:{ //Buy apples
            int amount = getQuantity("apples", "buy", city);
            if(!buyApples(amount, city)){
              System.out.println("Yo don't have enough money");
            }
            break;
          }//end case 3
          case 4:{//Sell apples
            int amount =  getQuantity("apples", "buy", city);
            if(!sellApples(amount, city)){
              System.out.println("Yo don't have enough apples");
            }
            break;
          }//end case 4
          case 5:{
            int amount = getQuantity("apples", "buy", city);
            if(!buyPears(amount, city)){
              System.out.println("Yo don't have enough money");
            }
            break;
          }//end case 5
          case 6:{
            int amount = getQuantity("apples", "buy", city);
            if(!sellPears(amount, city)){
               System.out.println("Yo don't have enough pears");
            }
          }//end case 6
        }//end switch
      }while(choice != 7);//end do-while loop
    }//end for loop
    System.out.println( "You finished with:" + currencyFormatter(cash));
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
  
  public static int getQuantity(String product, String action, String city){
    System.out.print("How many " + product + " do you want to " + action + " in " 
                     + city + " ?");
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextInt();
  }//end method getQuantity
  
  public static boolean buyApples(int amount, String city){
    if(city.compareTo("NewYork") == 0){
      if((amount * applePrice < cash)){
        cash -= amount * applePrice;
        appleInventoryNY += amount;
        return true;
      }
    }else if(city.compareTo("LosAngeles") == 0){
       if((amount * applePrice < cash)){
        cash -= amount * applePrice;
        appleInventoryLA += amount;
        return true;
      }
    }//end if-else
    return false;
  }//end method buyApples
  
  public static boolean sellApples(int amount, String city){
    if(amount > appleInventoryNY &&
       amount > appleInventoryLA){
      return false;
    }
    if(city.compareTo("NewYork") == 0){
      appleInventoryNY -= amount;
    }else if(city.compareTo("LosAngeles") == 0){
      appleInventoryLA -= amount;
    }
    cash += amount * applePrice;
    return true;
  }//end method sellApples
  
  public static boolean buyPears(int amount, String city){
    if(city.compareTo("NewYork") == 0){
      if((amount * applePrice < cash)){
        cash -= amount * applePrice;
        appleInventoryNY += amount;
        return true;
      }
    }else if(city.compareTo("LosAngeles") == 0){
       if((amount * applePrice < cash)){
        cash -= amount * applePrice;
        appleInventoryLA += amount;
        return true;
      }
    }//end if-else
    return false;
  }//end method buyPears
  
  public static boolean sellPears(int amount, String city){
    if(amount > appleInventoryNY &&
       amount > appleInventoryLA){
      return false;
    }
    if(city.compareTo("NewYork") == 0){
      pearInventoryNY -= amount;
    }else if(city.compareTo("LosAngeles") == 0){
      pearInventoryLA -= amount;
    }
    cash += amount * applePrice;
    return true;
  }//end method sellPears
  
  public static String getCityChoise(){
    Scanner keyboard = new Scanner(System.in);
    String city;
    do{
      System.out.print("Choose the city ");
      city = keyboard.next();
    }while(city.compareTo("LosAngeles") != 0 ||
           city.compareTo("NewYork") != 0);
    return city;
  }//end method getCityChoise
  
  public static int getAppleInvetory(String city){
    if(city.compareTo("NewYork") == 0){
      return appleInventoryNY;
    }
    return appleInventoryLA;
  }//end method getAppleInvetory
  
  public static int getPearInvetory(String city){
    if(city.compareTo("NewYork") == 0){
      return pearInventoryNY;
    }
    return pearInventoryLA;
  }//end method getAppleInvetory
}