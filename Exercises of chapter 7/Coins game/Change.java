import java.util.*;
public class Change{
  ArrayList<Coin> coins = new ArrayList<Coin>();
  
  public Change(){}//end const.
  
  public Change(int count){
    for(int i =0; i < count; i++){
      coins.add(new Coin());
    }//end for
  }//enc constr.
  
  public Change(ArrayList<Currency> values){
    for(Currency value:values){
      coins.add(new Coin(value));
    }//end for
  }//end constr.
  
  public void flipAllCoins(){
    for(Coin c : coins){
      c.flip();
    }//end for
  }//end method flipAllCoins
  
  public void flipSomeCoins(ArrayList<Integer> indexes){
    for(int i:indexes){
      coins.get(i).flip();
    }//end for
  }//end method flipSomeCoins
  
  public int computeSum(){
    int sum = 0;
    for(Coin c:coins){
      if(!c.isHead()){
        sum = sum + c.getValue();
      }//end if
    }//end for
    return sum;
  }//end method computeSum
  
  public String toString(){
    String result = "";
    for(Coin c:coins){
      result = result+c+" ";
    }//end for
    result = result + " Total: " + computeSum();
    return result;
  }//end method toString
}//end class Change