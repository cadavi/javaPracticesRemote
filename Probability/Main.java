public class Main{
  public static void main(String[] args){
    Coin coin = new Coin();
    int numOfHeads = 0;
    for(int i = 0; i < 10000;i++){
      coin.flip();
      if(coin.isHead()){
        numOfHeads++;
      }//end if
    }//end for;
    System.out.print("Number of heads: " + numOfHeads);
  }//end main method
}//enc class Main 