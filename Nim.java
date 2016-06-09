import java.util.*;
public class Nim{
  public static void main(String args[]){
    System.out.println("Welcome to my game of nim");
    Scanner inputTotalOfToothpicks = new Scanner(System.in);
    int inputTotalOfToothpicksComputer = 0;
    Scanner inputRemoreToothpicks = new Scanner(System.in);
    int totalOfToothpicks = 0;
    int toothpicksToRemove;
    int playFirst = (int)(Math.random() * 2); //playFirst == 0 human, playFirst == 1 computer
    boolean isHuman;
    Random rand = new Random();
    boolean firstTime;
    int randResult;
    boolean win = true;
    String winMsg = "";
    if(playFirst == 0){ 
      System.out.print("Human, choose the total number of toothpicks ");
      firstTime = true;
      isHuman = true;
      do{
        do{
          if(firstTime){
            while(totalOfToothpicks < 21 || totalOfToothpicks > 30){
              System.out.print("The total number of toothpicks must be between 21 and 30");
              totalOfToothpicks = inputTotalOfToothpicks.nextInt();
            }
          }else{
            System.out.println("Human, there are " + totalOfToothpicks + " toothpicks left. How many toothpicks do you want to remove? ");
            toothpicksToRemove = inputRemoreToothpicks.nextInt();
            while(toothpicksToRemove < 1 || toothpicksToRemove > 3){
              System.out.print("Only can remove 1, 2 or 3 toothpicks");
              toothpicksToRemove = inputRemoreToothpicks.nextInt();
            }
            totalOfToothpicks -= toothpicksToRemove;
            isHuman = false;
          }
          isHuman = false;
          firstTime = false;
          win = true;
        }while(isHuman == true);
       if(totalOfToothpicks <= 0){
          System.out.println("Game over");
          win = false;
          break;
        }
        randResult = rand.nextInt(4 - 1)  + 1;
        System.out.println("Computer, there are " + totalOfToothpicks + " toothpicks left. How many toothpicks do you want to remove? " + randResult);
        totalOfToothpicks -= randResult;
        if(totalOfToothpicks <= 0){
          System.out.println("Game over");
          win = false;
          break;
        }
        isHuman = true;
      }while(totalOfToothpicks > 0);
      winMsg = (win)?"Human win!":"Computer win!";
      System.out.println(winMsg);
    }else{
      inputTotalOfToothpicksComputer = rand.nextInt(31 - 21) + 21;
      System.out.println("Computer, choose the total number of toothpicks " + inputTotalOfToothpicksComputer);
      isHuman = true;
      while(inputTotalOfToothpicksComputer > 0 ){
        if(isHuman){
          System.out.print("Human, there are " + inputTotalOfToothpicksComputer + " toothpicks left. How many toothpicks do you want to remove? ");
          toothpicksToRemove = inputRemoreToothpicks.nextInt();
           while(toothpicksToRemove < 1 || toothpicksToRemove > 3){
              System.out.print("Only can remove 1, 2 or 3 toothpicks");
              toothpicksToRemove = inputRemoreToothpicks.nextInt();
            }
           isHuman = false;
        }
      }
      
    }
  }
}