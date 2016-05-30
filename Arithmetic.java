
import java.util.*;
public class Arithmetic {
public static void main( String [] args ) {
int x = (int)(Math.random() * 10) ;
int y = (int)(Math.random() * 10) ;
Scanner keyboard = new Scanner(System.in);

int z;
do{
System.out.print(x + "*" + y + " = ");
z = keyboard.nextInt();
  if(z==x*y){
      System.out.println ( "This is correct!" ) ;
      break;
  }else{
     System.out.println("This is incorrect!" ) ;
  }
}while(true);
}
}