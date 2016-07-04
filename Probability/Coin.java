public class Coin{
  private int face;
  public final int HEADS = 1;
  public final int TAILS = 2;
  private double bias = 0.5;
  
  public void flip(){
    double rand = Math.random();
    face = (rand < bias)?HEADS:TAILS;
    bias = rand;
  }//end method flip
  
  public void setBias(double bias){
    this.bias = bias;
  }//end method setBias
  
  public boolean isHead(){
    return (face == HEADS);
  }//end method isHead
}//end class Coin