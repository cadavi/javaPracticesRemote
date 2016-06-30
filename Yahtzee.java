import java.util.*;
public class Yahtzee{
  public static final int NUMBER_REROLLS = 2;
  
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    DiceCup dc = new DiceCup();
    System.out.println(dc);
    for(int i = 0; i < NUMBER_REROLLS; i++){
      if(dc.isYahtzee()){
        break;
      }//end if
      System.out.println("Wich dice do you want to reroll?");
      dc.rollDice(convert(keyboard.nextLine()));
      System.out.println(dc);
    }//end for
    if(dc.isYahtzee()){
      System.out.println("You got Yahtzee!");
    }else{
      System.out.println("Sorry, better luck next time");
    }//end if
  }//end main
  
  static int[] convert(String s){
    StringTokenizer st = new StringTokenizer(s);
    int[] a = new int[st.countTokens()];
    int i = 0;
    while(st.hasMoreTokens()){
      a[i++] = Integer.parseInt(st.nextToken());
    }//end while
    return a;
  }//end emthod convert
}//end class Yahtzee