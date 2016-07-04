/*
Every time the mileage on the Odometer object goes up,
the amount of fuel should go down by the appropriate
amount (calculated from the gallons per mile of the car).
*/
public class FuelGauge{
  private double amountOfFuel;
  public static final double DEFAULT_AMOUNT_OF_FUEL = 10.0;
  
  public FuelGauge(double amountOfFuel){
    this.amountOfFuel = amountOfFuel;
  }//end const. FuelGauge
  
  public FuelGauge(){
    this(DEFAULT_AMOUNT_OF_FUEL);
  }//end const. FuelGauge
  
  public void fillTank(double amount){
    amountOfFuel += amount;
  }//end method fillTank
 
  public String toString(){
    return amountOfFuel+"";
  }//end method toString
  
  public void burnFuel(Odometer mileage){
    amountOfFuel = amountOfFuel / Double.parseDouble(mileage.toString());
  }//end method burnFuel
}//end class FuelGauge