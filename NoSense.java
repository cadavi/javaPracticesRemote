import java.util.*;
public class NoSense{
  public static void main(String args[]){
    do{
      System.out.print("Enter a positive number: ");
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      if(number < 0){
        System.out.println("Bye, you entered a negative number: " + number);
        break;
      }
    }while(true);   
  }
}