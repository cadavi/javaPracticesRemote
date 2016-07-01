import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner k = new Scanner(System.in);
    Board board = new Board();
    System.out.println(board);
    while(!board.isAllMarked()){
      int row, column;
      System.out.print("Enter guess: ");
      row = k.nextInt();
      column = k.nextInt();
      board.visit(row, column);
      if(board.isPartOfShip(row, column)){
        if(board.isSunkAt(row, column)){
          System.out.println("Ship destroyed!");
        }else{
          System.out.println("Ship destroyed!");
        }//end if
        System.out.println(board);
      }else{
        System.out.println("Empty!");
        System.out.println(board);
      }//end if
    }//end while 
  }//end main method
}//end Main class