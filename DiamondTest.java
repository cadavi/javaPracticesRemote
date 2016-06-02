import java.util.*;
public class DiamondTest{
  public static void main(String args[]){
    System.out.print("Enter the diamond size: ");
    Scanner keyboard = new Scanner(System.in);
    int diamondSize = keyboard.nextInt();
    int numStars = 1;
    int numSpaces = diamondSize - 1;
    //print the first half
    for(int line = 0; line < diamondSize / 2 + 1; line++){
      for(int i = 0; i < numSpaces; i++){
        System.out.print(" ");
      }
      for(int i = 0; i < numStars; i++){
        System.out.print("* ");
      }
     System.out.println();
     numSpaces -= 2;
     numStars += 2;
    }
    
    numStars = diamondSize - 2;
    numSpaces = 2;
    //print the second half
    for(int line = 0; line < diamondSize / 2; line++){
      for(int i = 0; i < numSpaces; i++){
        System.out.print(" ");
      }
      for(int i = 0; i < numStars; i++){
        System.out.print("* ");
      }
     System.out.println();
     numSpaces += 2;
     numStars -= 2;
    }
  }
}