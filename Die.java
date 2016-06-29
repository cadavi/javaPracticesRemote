class Die{
  public static final int DEFAULT_NUMBER_OF_SIDES=6;
  private int dieValue;
  private int numberOfSides;
  
  public Die(){
    this(DEFAULT_NUMBER_OF_SIDES);
  }//end const. Die
  
  public Die(int numberOfSides){
    this.numberOfSides = numberOfSides;
    dieValue = getRandomDieValue();
  }//end const. Die
  
  public void rollDice(){
    dieValue = getRandomDieValue();
  }//end method rollDice
  
  public String toString(){
    return dieValue+"";
  }//end method toString
  
  //This method simply checks if d1 and d2 have the same value for the variable dieValue.
  public boolean equals(Die otherDie){
    return (dieValue==otherDie.dieValue);
  }//end method equals
  
  private int getRandomDieValue(){
    return (int)(Math.random() * numberOfSides + 1);
  }//end method getRandomDieValue
}//end class Die