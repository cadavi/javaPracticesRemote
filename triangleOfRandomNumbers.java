/*
 Write a program that displays a triangle of random numbers (each number should be
between 0 and 9). The height of the triangle should be user specified.
 */
import java.util.*;
public class triangleOfRandomNumbers{
  public static void main(String args[]){
    System.out.print(randomNumbers());
  }
  
  public static int randomNumbers(){
    int randomNumber;
    do{
      randomNumber = (int)(Math.random() * 10);
    }while(randomNumber < 0 || randomNumber > 9);
    return randomNumber;
  }
  
  public static void drawTriangle(int triangleSize){
  }
}