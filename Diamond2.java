import java.util.*;

public class Diamond2{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the size of the Diamond: ");
    int size = keyboard.nextInt();
    for(int numStars = 1, numSpaces = size - 1; numSpaces >= 0;
        numSpaces -= 2, numStars += 2){
          for(int i = 0; i < numSpaces; i++){
            System.out.print(" ");
          }
          for(int i = 0; i < numStars; i++){
            System.out.print("* ");
          }
          System.out.println();
    }
    
   for(int numStars = size - 2, numSpaces = 2; numStars > 0;
       numSpaces += 2, numStars -= 2){
         for(int i = 0; i < numSpaces; i++){
           System.out.print(" ");
         }
         for(int i = 0; i < numStars; i++){
           System.out.print("* ");
         }
         System.out.println();
   }
  }
}