import java.util.*;
public class Yahtzee{
  static final int NUMBER_OF_DICE = 5;
  static final int NUM_REROLLS = 2;
  
  public static void main(String[] args){
    int[] dice = new int[NUMBER_OF_DICE];
    Scanner keyboard = new Scanner(System.in);
    rollDice(dice);
    
    for(int i = 0; i < NUM_REROLLS; i++){
      if(isYahtzee(dice)){// if we got Yahtzee
        break;
      }//end if
      System.out.println(diceToString(dice));
      System.out.print("Wich dice do you want to reroll");
      rollDice(convert(keyboard.nextLine()));
    }//end for
  }//end method main
  
  public static void rollDice(int[] dice){
    for(int i = 0; i < dice.length; i++){
      dice[i] = getRandomDieValue();
    }//end for
  }//end method rollDice
  
  public static int[] rollDice(){
    int [] d = new int [NUMBER_OF_DICE] ;
    for (int i = 0; i < d.length; i++) {
      d [i] = getRandomDieValue();
    }
    return d;
  }//end method rollDice
  
  public static int getRandomDieValue(){
    return (int)(Math.random() * 6 + 1);
  }//end method getRandomDieValue
  
  public static int[] convert(String s){
    StringTokenizer st = new StringTokenizer(s);
    int[] a = new int[st.countTokens()];
    int i = 0; 
    while(st.hasMoreTokens()){
      a[i++] = Integer.parseInt(st.nextToken());
    }//end while
    return a;
  }//end method convert
  
  public static boolean isYahtzee(int[] dice){
    for(int e1:dice){
      if(e1 != dice[0]){// evidence that the dice are different
        return false;
      }//end if
    }//end for
    return true;
  }//end method isYahtzee
  
  public static String diceToString(int[] dice){
    String result = "Your dice are: ";
    for(int i = 0; i < NUMBER_OF_DICE; i++){
      result += dice[i]+" ";
    }//end for
    return result;
  }//end method diceToString
}//end class Yahtzee