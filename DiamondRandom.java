/*
The printed numbers are random digits between 0 and 9. In Java, Math.random() returns
a random double that is greater than or equal to 0 and smaller than 1. The method is
defined in the library java.math.* (use import java.math.*) . Multiply this number by
something to get a digit between 0 and 9. Use int i = (int) d; to convert a double to
an int.
 */
import java.util.*;
public class DiamondRandom{
  public static void main(String args[]){
     System.out.println("    " +  ((int)(Math.random() * 10)));
     System.out.println("  " + ((int)(Math.random() * 10)) +
                        " " +  ((int)(Math.random() * 10)) +
                        " " + ((int)(Math.random() * 10)));
     System.out.println(((int)(Math.random() * 10)) + " " +
                        ((int)(Math.random() * 10)) + " " +
                        ((int)(Math.random() * 10)) + " " +
                        ((int)(Math.random() * 10)) + " " +
                        ((int)(Math.random() * 10)));
     System.out.println("  " + ((int)(Math.random() * 10)) +
                        " " +  ((int)(Math.random() * 10)) +
                        " " + ((int)(Math.random() * 10)));
     System.out.println("    " +  ((int)(Math.random() * 10)));
     //System.out.println("      "+(int)(Math.random() * 10));
  }
}