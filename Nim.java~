import java.util.*;
public class Nim{
  public static void main(String args[]){
    int playFirst = (int)(Math.random() * 2);// playFirst = 1, go user, playFirst = 2, go the computer
    Scanner keyboard = new Scanner(System.in);
    int numToothpicks;
    Scanner inputNumToRemove = new Scanner(System.in);
    int numToremove;
    System.out.println("Welcome to my game of Nim.");
    if( playFirst == 1){
      System.out.println("This time you are going to go first.");
      System.out.println("I choose the total number of toothpicks to be " );
       do{
         numToothpicks = keyboard.nextInt();
         if(numToothpicks > 20 && numToothpicks < 30){
           System.out.print("There are " + numToothpicks + " left. How many toothpicks do you want to remove? " );
           numToremove = inputNumToRemove.nextInt();
           do{
             System.out.print("Human only can remove 1 ,2 or 3 toothpicks. Please enter the num of toothpicks that want to remove ");
             numToremove = inputNumToRemove.nextInt();
             if(numToremove >= 1 || numToremove <= 3){
               numToothpicks -= numToremove;
               System.out.print("Number of toothpicks left: " + numToothpicks);
               break;
             }
           }while(numToremove < 1 || numToremove > 3);
           break;
         }
         System.out.println("The number of toothpicks must be bigger than 20 and smaller than 30");
       }while(numToothpicks < 21 || numToothpicks > 29);
    }else{
      System.out.println("This time the computer are going to go first.");
      do{
        numToothpicks = (int)(Math.random() * 31); 
      }while(numToothpicks <= 20);
      System.out.println("I choose the total number of toothpicks to be " + numToothpicks);   
    }
  }
}