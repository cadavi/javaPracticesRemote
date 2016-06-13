import java.util.*;
public class Fibonacci{
  public static void main(String args[]){
    fibonacciSerie(20);
  }
  
  public static void fibonacciSerie(int n){
    ;
    int a = 0;
    int b = 1;
    int c = 0;
    System.out.print(a+" "+b);
    for(int i = 2; i <= n - 1; i++){
       c = a + b;//1, 2, 3, 5, 8, etc.
       a = b;//1, 1, 2, 3, 5 etc.
       b = c;//1, 2, 3, 5, 8 etc.
       System.out.print(" " + c);
    }
  }
}