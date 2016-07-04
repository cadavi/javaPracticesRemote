import java.util.*;
public class Main{
  public static void main(String[] args){
    BankAccount[] bk = new BankAccount[1000];
    Scanner keyboard = new Scanner(System.in);
    int i;
    do{
      printMenu();
      i = keyboard.nextInt();
      switch(i){
        case 1: 
          BankAccount account = new BankAccount();
          System.out.println("Account number: " + account);
          bk[account.getAccountNumber()] = account;
          break;
        case 2:{
          System.out.println("What's your account number?");
          int accNum = keyboard.nextInt(); 
          System.out.println("What's the amount that you want to withdraw?");
          double amountToW = keyboard.nextDouble();
          bk[accNum].withdrawMoney(amountToW);
          System.out.println("New balance: " + bk[accNum].getCash());
          break;
        }
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