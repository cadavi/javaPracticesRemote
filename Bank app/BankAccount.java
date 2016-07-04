public class BankAccount{
  private static int accountNumber;
  private double cash;
  public static final double INITIAL_CASH = 100.0;
  
  public int getAccountNumber(){
    return accountNumber;
  }//end method getAccountNumber
  
  public double getCash(){
    return cash;
  }//end method getCash
  
  public BankAccount(){
    this(INITIAL_CASH);
  }//end const. 
    
  public BankAccount(double cash){
    this.cash = cash; 
    accountNumber++;
  }//end const. 
  
  public String toString(){
    return accountNumber+"";
  }//end method toString
  
  public double withdrawMoney(double amount){
    if(amount > cash){
      return 0.0;
    }//end if
    return cash - amount;
  }//end method withdrawMoney
  
  public void depositMoney(double amount){
    if(amount > 0){
      cash += amount;
    }//end if
  }//end method depositMoney
}//end class BankAccount