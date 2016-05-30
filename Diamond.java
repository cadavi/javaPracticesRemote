import java.util.*;
public class Diamond{
  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter size of the diamond: ");
    int size = keyboard.nextInt();
    int numStars = 1;
    int numSpaces = size -1;
    for(int line = 0; line < size / 2 + 1; line++ ){
      for(int i = 0; i < numSpaces; i++){
        System.out.print("-");
      }
      for(int i = 0; i < numStars; ++i){
        System.out.print("* ");
      }
      System.out.println();
      numSpaces -= 2;
      numStars += 2;
    }
  }
}