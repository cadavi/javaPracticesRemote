import java.util.*;
public class Nim{
  public static void main(String args[]){
    System.out.println("Welcome to my game of nim");
    Scanner inputTotalOfToothpicks = new Scanner(System.in);
    int totalOfToothpicks;
    int toothpicksToRemove;
    int playFirst = (int)(Math.random() * 2); //playFirst == 0 human, playFirst == 1 computer
    if(playFirst == 0){
      System.out.print("Human, choose the total number of toothpicks ");
      do{
         totalOfToothpicks = inputTotalOfToothpicks.nextInt();
         while(totalOfToothpicks < 1 || totalOfToothpicks > 3){
         System.out.print("The number of toothpicks to remove must be 1, 2 or 3");
         totalOfToothpicks = inputTotalOfToothpicks.nextInt();
        }
      }while(totalOfToothpicks != 0);
    }
  }
}