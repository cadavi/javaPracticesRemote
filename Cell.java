public class Cell{
  private Ship ship;
  private boolean isVisited = false;
  
  public void visit(){
    isVisited = true;
  }//end method visit
  
  public boolean isVisited(){
    return isVisited;
  }//end method isVisited
  
  public boolean isPartOfShip(){
    return (ship != null);
  }//end method isPartOfShip
  
  public void putShip(Ship ship){
    this.ship = ship;
  }//end method putShip
  
  public String toString(){
    if(!isVisited){
      return "0";
    }else{
      if(ship != null){
        return "X";
      }else{
        return " ";
      }//end if
    }//end if
  }//end method toString
  
  public boolean isSunk(){
    return ship.isSunk();
  }//end method isSunk
  
}//end class Cell