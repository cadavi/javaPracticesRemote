public class Coin{
  public static  final double DEFAULT_BIAS = 0.5;
  private Currency value;
  private Face face;
  private double bias;
  
  public Coin(){
    this.bias = DEFAULT_BIAS;
    this.value = getRandomCoinValue();
    flip();
  }//end constr. 
  
  public Coin(Currency value){
    this.value = value;
    this.bias = DEFAULT_BIAS;
    flip();
  }//end const.
  
  public Coin(Currency value, double bias){
    this.value = value;
    this.bias = bias;
    flip();
  }//end const.
  
  public void flip(){
    face = (bias < Math.random())?Face.HEADS:Face.TAILS;//true is HEADS
  }//end method flip
  
  private Currency getRandomCoinValue(){
    double randomNumber = Math.random();
    if(randomNumber < 0.25){
      return Currency.PENNY;
    }//end if
    if(randomNumber < 0.5){
      return Currency.NICKEL;
    }//end if
    if(randomNumber < 0.75){
      return Currency.DIME;
    }//end if
    return Currency.QUARTER;
  }//end method getRandomCoinValue
  
  public String toString(){
    return (face==Face.TAILS)?value.toString():"HEADS";
  }//end method toString
  
  public int getValue(){
    return value.getValue();
  }//end method 
  
  public boolean isHead(){
    return (face == Face.HEADS);
  }//end method isHead
}//end class Coin

enum Currency{
  PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
  private int value;
  
  private Currency(int value){
    this.value = value;
  }//end const. Currency
  
  public int getValue(){
    return value;
  }//end method getValue
}//end enum Currency

enum Face{
  HEADS(true), TAILS(false);
  private boolean value;
  
  private Face(boolean value){
    this.value = value;
  }//end constr. Face
  
  public boolean getValue(){
    return value;
  }//end method getValue
}//end enum Face