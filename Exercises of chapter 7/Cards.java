/*
Write a program that prints five random playing cards, where all cards must be
different. Example output is: “queen of spades”, “ten of clubs”, “three of diamonds”,
“five of hearts”, “seven of spades”. Use the enum construct for both the value and suit
of the card. The value of a card can be: “two”, “three”, “four”, “five”, “six”, “seven”,
“eight”, “nine”, “ten”, “Jack”, “Queen”, “King”, or “Ace”. The suit of a card can be
“spades”, “hearts”, “diamonds”, or “clubs”. Store the cards in an ArrayList. Before
inserting a new card in the ArrayList, ensure that the card is not already in the list.
*/
import java.util.*;
public class Cards{
  public static final int NUMBER_OF_RANDOM_CARDS = 5;
  private ArrayList<String> card = new ArrayList<String>();
  
  public Cards(){
    fillCard();
  }//end constr.
  
  public void fillCard(){
    String str;
    card.add(getRandomCard()+" OF "+getRandomCardSuit());
    int i = NUMBER_OF_RANDOM_CARDS-1;
    while(i > 0){
       str = getRandomCard()+" OF "+getRandomCardSuit();
      if(!isInTheList(str, card)){
        card.add(str);
        i--;
      }//end if
    }//end while
  }//end method fillCard
  
  private boolean isInTheList(String str,  ArrayList<String> cardStr){
    for(int i = 0; i < cardStr.size();i++){
      if(str.equals(cardStr.get(i))){
        return true;
      }//end if
    }//end for
    return false;
  }//end method isInTheList
  
  public String toString(){
    return this.card+"";
  }//end method printCards
  
  public String getRandomCard(){
    int randomCardNumber = (int)(Math.random() * 13) + 1;
    switch(randomCardNumber){
      case 1: return CardValue.ACE+"";
      case 2: return CardValue.TWO+"";
      case 3: return CardValue.THREE+"";
      case 4: return CardValue.FOUR+"";
      case 5: return CardValue.FIVE+"";
      case 6: return CardValue.SIX+"";
      case 7: return CardValue.SEVEN+"";
      case 8: return CardValue.EIGHT+"";
      case 9: return CardValue.NINE+"";
      case 10: return CardValue.TEN+"";
      case 11: return CardValue.JACK+"";
      case 12: return CardValue.QUEEN+"";
      case 13: return CardValue.KING+"";
      default: return CardValue.ACE+"";
    }//end switch
  }//end method printRandomCards
  
  public String getRandomCardSuit(){
    int randomSuit = (int)(Math.random() * 4) + 1;
    switch(randomSuit){
      case 1: return CardSuit.SPADES+"";
      case 2: return CardSuit.HEARTS+"";
      case 3: return CardSuit.DIAMONDS+"";
      case 4: return CardSuit.CLUBS+"";
      default: return CardSuit.SPADES+"";
    }//end switch
  }//end method getRandomCardSuit
}//end class Cards

 enum CardValue{
  ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
  SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
  private int value;
  private CardValue(int value){
    this.value = value;
  }//end const.
  
  public int getValue(){
    return value;
  }//end method getValue
}//end enum CardValue
 
 enum CardSuit{
   SPADES(1), HEARTS(2), DIAMONDS(3), CLUBS(4);
   private int value;
   
   private CardSuit(int value){
     this.value = value;
   }//end constr.
   
   public int getValue(){
     return value;
   }//end method getValue
 }//end enum CardSuit

