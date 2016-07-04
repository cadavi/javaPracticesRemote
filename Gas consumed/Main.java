import java.util.*;
public class Main{
  public static void main(String[] args){
    FuelGauge fg = new FuelGauge(100);
    Odometer odom = new Odometer(5, 35);
    int input;
    do{
      printMenu();
      Scanner keyboard = new Scanner(System.in);
      input = keyboard.nextInt();
      switch(input){
        case 1: System.out.println("Amount of fuel: "+fg);
                break;
        case 2: System.out.println("Mileage recorred: "+odom);
                break;
        case 3: System.out.println("Mileage per gallon: "+ odom.getMilesPerGallon());
                break;
                
        case 4: odom.run(fg);
                System.out.println("New mileage: "+odom);
                System.out.println("amount of fuel: "+fg);
                break;
        case 5: System.out.println("Enter the amount: ");
                Scanner keyb = new Scanner(System.in);
                double amountToFill = keyb.nextDouble();
                fg.fillTank(amountToFill);
                System.out.println("New amount of fuel: " + fg);
                break;
        case 6: System.exit(0);
        default: System.out.println("Choose one option from the menu");
        break;
      }//end switch
    }while(input != 6);
  }//end main method 
  
  public static void printMenu(){
      System.out.println("What do you want to do?");
      System.out.println("1. See amount of fuel");
      System.out.println("2. See mileage recorred");
      System.out.println("3. See mileage per gallon");
      System.out.println("4. Run");
      System.out.println("5. fill the tank");
      System.out.println("6. Exit");
  }//end method menu
}//end class Main