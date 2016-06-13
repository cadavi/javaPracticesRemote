import java.util.*;
public class Distance{
  public static void main(String args[]){
    System.out.println("Duration of the trip.");
    System.out.print("Enter the speed: ");
    Scanner keyboard = new Scanner(System.in);
    int speed = keyboard.nextInt();
    System.out.print("Enter the time: ");
    int time = keyboard.nextInt();
    System.out.print("The distance is: " + distance(speed, time));
  }
  
  public static int distance(int speed, int time){
    return speed * time;
  }
}