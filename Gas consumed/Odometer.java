public class Odometer{
  private int milesPerGallon;
  private int currentMileage;
  
  public Odometer(){
    currentMileage = 0;
    milesPerGallon = 35;
  }//end constr. Odometer
  
  public Odometer(int currentMileage, int milesPerGallon){
    this.currentMileage = currentMileage;
    this.milesPerGallon = milesPerGallon;
  }//end constr. Odometer
  
  public int getMilesPerGallon(){
    return milesPerGallon;
  }//end method getMilesPerGallon
  
  public void setMilesPerGallon(int milesPerGallon){
    this.milesPerGallon = milesPerGallon;
  }//end method setMilesPerGallon
  
  public String toString(){
    return currentMileage + "";
  }//end method toString
  
  public void run(FuelGauge fg){
    currentMileage++;
    fg.burnFuel(this);
  }//end method run
}//end class Odometer