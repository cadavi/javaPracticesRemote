public class DiceCup{
  private Die[] dice;
  private int numberOfDice;
  public static int DEFAULT_NUMBER_OF_DICE = 5;
  
  public DiceCup(){
    numberOfDice = DEFAULT_NUMBER_OF_DICE;
    dice = new Die[numberOfDice];
    for(int i = 0; i < numberOfDice; i++){
      dice[i] = new Die();
    }//end for
  }//end construct. 
  
  public DiceCup(int numberOfDice, int numberOfSides){
    this.numberOfDice = numberOfDice;
    dice = new Die[numberOfDice];
    for(int i = 0; i < numberOfDice; i++){
      dice[i] = new Die();
    }//end for
  }//end construct.
  
  public String toString(){
    String result = "Your dice are: ";
    for(Die d: dice){
      result += d+"";
    }//end for
    return result;
  }//end method toString
  
  public boolean isYahtzee(){
    for(Die d: dice){
      if(!d.equals(dice[0])){
        return false;
      }//end if
    }//end for
    return true;
  }//end method isYahtzee
  
  public void rollDice(int[] diceToChange){
    for(int i: diceToChange){
      dice[i - 1].rollDice();
    }//end for
  }//end method rollDice
}//end class DiceCup