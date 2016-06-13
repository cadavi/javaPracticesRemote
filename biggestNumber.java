import java.util.*;
public class biggestNumber{
  public static void main(String args[]){
   System.out.print("Enter the first number");
   int number1 = input();
   System.out.print("Enter the second number");
   int number2 = input();
   System.out.print("Enter the second number");
   int number3 = input();
   int biggestNum = biggestInteger(number1, number2, number3);
   System.out.println("The biggest number is: " + biggestNum);
  }
  
  public static int biggestInteger(int integer1, int integer2, int integer3){
    int max = integer1;
    if(integer2 > max){
      max = integer2;
    }
    if(integer3 > max){
      max = integer3;
    }
    return max;
  }
  
  public static int input(){
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextInt();
  }
}