import java.util.*;
public class Nim{
  public static void main(String args[]){
    int playFirst = (int)(Math.random() * 2);// playFirst = 1, go user, playFirst = 2, go the computer
    Scanner keyboard = new Scanner(System.in);
    int numToothpicks;
    Scanner inputNumToRemove = new Scanner(System.in);
    int numToremove;
    boolean isHuman;
    boolean firstCycle;
    System.out.println("Welcome to my game of Nim.");
    if( playFirst == 1){
      System.out.println("This time you are going to go first.");
      System.out.println("I choose the total number of toothpicks to be " );
      isHuman  = true;
      firstCycle = true;
       do{
         numToothpicks = keyboard.nextInt();
         if(numToothpicks > 20 && numToothpicks < 30){
           firstCycle = true;
           System.out.print("There are " + numToothpicks + " left. How many toothpicks do you want to remove? " );
           numToremove = inputNumToRemove.nextInt();
           do{
            if(numToremove == 1 || numToremove == 2 || numToremove == 3){
               numToothpicks -= numToremove;
               isHuman = false;
               while(numToothpicks != 0 && isHuman == false){
                 do{
                    numToremove = (int)(Math.random() * 4); 
                 }while(numToremove < 1);
                 System.out.println("Computer turn, there are " + numToothpicks + " toothpicks left. I, the Computer, will remove " + numToremove + " of them.");
                 numToothpicks -= numToremove;
                 isHuman = true;
               }
               
               while(numToothpicks != 0 && isHuman == true){
                 System.out.println("Human turn, there are " + numToothpicks + " toothpicks left.");
                 System.out.println("How many toothpicks do you want remove? ");
                 numToremove = inputNumToRemove.nextInt();
                 while(numToremove < 1 || numToremove > 3){
                    System.out.print("Human only can remove 1, 2 or 3 toothpicks. Please enter the num of toothpicks that want to remove ");
                    numToremove = inputNumToRemove.nextInt();
                 }
                 numToothpicks -= numToremove;
                 isHuman = false;
               }
             }else{
               System.out.print("Human only can remove 1, 2 or 3 toothpicks. Please enter the num of toothpicks that want to remove ");
               numToremove = inputNumToRemove.nextInt();
             }
           }while(numToremove < 1 || numToremove > 3);
         }
         
         if((numToothpicks < 21 || numToothpicks > 29) && firstCycle == false){
           System.out.print("The number of toothpicks must be bigger than 20 and smaller than 30");
           numToremove = inputNumToRemove.nextInt();
         }
       }while(numToothpicks < 21 || numToothpicks > 29  && firstCycle == false);
    }else{
      System.out.println("This time the computer are going to go first.");
      do{
        numToothpicks = (int)(Math.random() * 31); 
      }while(numToothpicks <= 20);
      System.out.println("I choose the total number of toothpicks to be " + numToothpicks);   
    }
  }
}