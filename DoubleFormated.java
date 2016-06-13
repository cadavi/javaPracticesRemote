import java.util.*;
import java.text.DecimalFormat;
public class DoubleFormated{
  public static void main(String args[]){
    System.out.print("Enter a double number: ");
    Scanner keyboard = new Scanner(System.in);
    double number = keyboard.nextDouble();
    System.out.print("Double formated: " + doubleWithFormat(number));
  }
  
  public static String doubleWithFormat(double number){
    DecimalFormat dFormat = new DecimalFormat("$###,####.00");
    return dFormat.format(number);
  }
}