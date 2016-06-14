/*
 Write a program that displays a triangle of random numbers (each number should be
between 0 and 9). The height of the triangle should be user specified.
 */
import java.util.*;
public class TriangleOfRandomNumbers{
  public static void main(String args[]){
    System.out.print("Enter the height of triangle: ");
    Scanner keyboard = new Scanner(System.in);
    int triangleHeight = keyboard.nextInt();
    drawTriangle(triangleHeight);
  }
  
  public static int randomNumbers(){
    int randomNumber;
    do{
      randomNumber = (int)(Math.random() * 10);
    }while(randomNumber < 0 || randomNumber > 9);
    return randomNumber;
  }
  
  public static void drawTriangle(int triangleHeight){
    for(int i = 0; i < triangleHeight; i++){
      System.out.println(randomNumbers());
      for(int j = 0; j < triangleHeight - 3; j++){
        System.out.print(randomNumbers() + " ");
      }
    }
  }
}