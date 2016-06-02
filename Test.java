import java.util.*;
public class Test{
  public static void main(String args[]){
    System.out.println("Please enter a decimal number: ");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    String result = "";
    while(number > 0){
      int reminder = number % 16;
      if(reminder <= 9){
        result += reminder;
      }else{
        result += (char)('A' + reminder-10);
      }
      number /= 16;
    }
    System.out.print("The number in hexadecimal is: ");
    for(int i = 0; i <= result.length(); i++){
      System.out.print(result.charAt(result.length()-i-1));
    }
    System.out.println();
  }
}