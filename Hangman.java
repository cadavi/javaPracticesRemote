import java.util.*;
public class Hangman{
  public static void main(String args[]){
    System.out.print("Player 1 enter the word: ");
    Scanner player1Keyboard = new Scanner(System.in);
    String player1Word = player1Keyboard.next();
    Scanner player2Keyboard = new Scanner(System.in);
    String player2letter;
    int index;
    int i = 1;
    char character;
    String charToString;
    do{
      System.out.print("Player 2 enter guess: ");
      player2letter = player2Keyboard.next();
      index = player1Word.indexOf(player2letter);
      i++;
      if(index >= 0){
        for(int j = 0; j < player1Word.length(); j++){
          character = player1Word.charAt(j);
          charToString = String.valueOf(character);
          if(charToString.compareTo(player2letter) == 0){
             System.out.println("at position: " + (j + 1));
          }
        }
      }else{
        System.out.println("No letter " + player2letter);
      }
      
      if(i == 7){
        System.out.print("Enter word: ");
        player2letter = player2Keyboard.next();
        if(player1Word.compareTo(player2letter) == 0){
          System.out.print("This is correct!");
        }else{
          System.out.print("This is NOT correct!");
        }
      }
    }while(i <= 6);  
  }
}