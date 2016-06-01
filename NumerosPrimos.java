import java.util.*;
public class NumerosPrimos{
  public static void main(String args[]){
    System.out.print("Enter the number to evaluate: ");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    for(int i = 3; i < number; i++){
       //System.out.println(i + " " + number + " " +number%i);
       if(number%i == 0){
          System.out.println("The number is primus: "+number);
          System.out.println(i + " " + number + " " +number%i);
          break;
      }
    }
  }
}