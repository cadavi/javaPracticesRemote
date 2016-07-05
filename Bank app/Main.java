import java.util.*;
public class Main{
  public static void main(String[] args){
    BankAccount[] bk = new BankAccount[1000];
    Scanner keyboard = new Scanner(System.in);
    int i;
    int inc = 0;
    do{
      printMenu();
      i = keyboard.nextInt();
      switch(i){
        case 1: 
          bk[inc++] = new  BankAccount();
          System.out.println("Inc. values " + (inc - 1));
          System.out.println("Account number: " + bk[(inc-1)].toString());
          break;
        case 2:{
          System.out.println("What's your account number?");
          int accNum = keyboard.nextInt(); 
          System.out.println("What's the amount that you want to withdraw?");
          double amountToW = keyboard.nextDouble();
          bk[accNum].withdrawMoney(amountToW);
          break;
        }//end case 2
        case 3:{
          System.out.println("What's your account number?");
          int accNum = keyboard.nextInt(); 
          System.out.println("What's the amount that you want to deposit?");
          double amountToW = keyboard.nextDouble();
          bk[accNum].depositMoney(amountToW);
          break;
        }//end case 3
        case 4:{
          System.out.println("What's your account number?");
          int accNum = keyboard.nextInt(); 
          System.out.println("Balance: "+bk[accNum].getBalance());
          break;
        }//end case 4
        case 5: System.exit(0);
      }//end switch
    }while(i != 5);
  }//end main method
  
  public static void printMenu(){
    System.out.println("1. Open account");
    System.out.println("2. Withdraw money");
    System.out.println("3. Deposit money");
    System.out.println("4. Show balance");
    System.out.println("5. Go home");
  }//end printMenu 
}//end class Main