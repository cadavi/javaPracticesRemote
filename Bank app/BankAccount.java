public class BankAccount{
  private static int accountNumber;
  private double cash;
  public static final double INITIAL_CASH = 100.0;
  private int idAccount;
  
  public int getAccountNumber(){
    return accountNumber;
  }//end method getAccountNumber
  
  public double getBalance(){
    return cash;
  }//end method getCash
  
  public BankAccount(){
    this(INITIAL_CASH);
  }//end const. 
    
  public BankAccount(double cash){
    this.cash = cash; 
    idAccount = accountNumber++;
  }//end const. 
  
  public String toString(){
    return idAccount+"";
  }//end method toString
  
  public double withdrawMoney(double amount){
    if(amount > cash){
      return 0.0;
    }//end if
    cash -= amount;
    return cash;
  }//end method withdrawMoney
  
  public void depositMoney(double amount){
    if(amount > 0){
      cash += amount;
    }//end if
  }//end method depositMoney
}//end class BankAccount