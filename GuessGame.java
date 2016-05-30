import java.util.*;
public class GuessGame{
  public static void main(String args[]){
    int number = (int)(Math.random() * 1000);
    Scanner keyboard = new Scanner(System.in);
    int numTries;
    for(numTries = 0; numTries < 10; numTries++){
      System.out.println("Enter your guess: ");
      int guess = keyboard.nextInt();
      if(guess > number){
        System.out.println("Go lower");
        continue;
      }
      if(guess < number){
        System.out.println("Go higher");
        continue;
      }
      System.out.println("You got it!");
      break;
    }
    if(numTries == 10){
    System.out.println( "You ran out of guesses" ) ;
    System.out.println( "My number was: "+number) ;
    }
  }
}