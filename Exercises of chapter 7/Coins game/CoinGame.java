import java.util.*;
public class CoinGame{
  public static final int NMBER_FLIPS = 2;
  
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Currency> currency = new ArrayList<Currency>();
    Change change = new Change(10);
    System.out.println(change);
    for(int i = 0; i < NMBER_FLIPS; i++){
      System.out.print("Which coins do you want to flip: ");
      change.flipSomeCoins(convert(keyboard.nextLine()));
      System.out.println(change) ;
    }//end for
  }//end method main
  
  public static ArrayList<Integer> convert(String s){
    StringTokenizer st = new StringTokenizer(s);
    ArrayList<Integer> result = new ArrayList<Integer>();
    while(st.hasMoreTokens()){
      result.add(Integer.parseInt(st.nextToken()) - 1);
    }//end while 
    return result;
  }//end method convert
}//end class CoinGame