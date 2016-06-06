import java.util.*;
public class Nim{
  public static void main(String args[]){
    int playFirst = (int)(Math.random() * 2);// playFirst = 1, go user, playFirst = 2, go the computer
    //int randomNumToothpicks = (int)(Math.random() * 31);//Ojo
    Scanner keyboard = new Scanner(System.in);
    int numToothpicks;
    System.out.println("Welcome to my game of Nim.");
    if( playFirst == 1){
      System.out.println("This time you are going to go first.");
      System.out.println("I choose the total number of toothpicks to be " );
       do{
         numToothpicks = keyboard.nextInt();
         if(numToothpicks > 21 && numToothpicks < 30){
           break;
         }
         System.out.println("The number of toothpicks must be bigger than 20 and smaller than 30");
       }while(numToothpicks < 21 || numToothpicks > 29);
    }else{
      int randomNumToothpicks;
      System.out.println("This time the computer are going to go first.");
      do{
        randomNumToothpicks = (int)(Math.random() * 31); 
      }while(randomNumToothpicks <= 20 );
      System.out.println("I choose the total number of toothpicks to be " + randomNumToothpicks);   
    }
  }
}