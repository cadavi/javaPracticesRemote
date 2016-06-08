import java.util.*;
public class Nim{
  public static void main(String args[]){
    System.out.println("Welcome to my game of nim");
    Scanner inputTotalOfToothpicks = new Scanner(System.in);
    Scanner inputRemoreToothpicks = new Scanner(System.in);
    int totalOfToothpicks = 0;
    int toothpicksToRemove;
    int playFirst = (int)(Math.random() * 2); //playFirst == 0 human, playFirst == 1 computer
    boolean isHuman;
    Random rand = new Random();
    boolean firstTime;
    int randResult;
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
              toothpicksToRemove = inputRemoreToothpicks.nextInt();
              System.out.print("Only can remove 1, 2 or 3 toothpicks");
            }
            totalOfToothpicks -= toothpicksToRemove;
            isHuman = false;
          }
          isHuman = false;
          firstTime = false;
        }while(isHuman == true);
        randResult = rand.nextInt(4 - 1)  + 1;
        System.out.println("Computer, there are " + totalOfToothpicks + " toothpicks left. How many toothpicks do you want to remove? " + randResult);
        totalOfToothpicks -= randResult;
        System.out.println("Left: " + totalOfToothpicks);
        isHuman = true;
      }while(totalOfToothpicks != 0);
    }
  }
}