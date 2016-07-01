public class Ship{
  private int startRow, startColumn;
  private boolean direction;
  private int size;
  private Board board;
  
  public Ship(int size, Board board){
    this.size = size;
    this.board = board;
    do{
      startRow = (int)(Math.random() * Board.BOARD_SIZE);
      startColumn = (int)(Math.random() * Board.BOARD_SIZE);
      direction = (Math.random() > 0.5) ? Board.VERTICAL:Board.HORIZONTAL;
    }while(!board.isFree(startRow, startColumn, direction, size));
    board.populate(startRow, startColumn, direction, size, this);
  }//end const.
  
  public boolean isSunk(){
    if(direction == Board.VERTICAL){
      for(int row = startRow, column = startColumn;
          row <= startRow + size -1; row++){
            if(!board.isVisited(row, column)){
              return false;
            }//end if
      }//end for
    }else{
      for(int row = startRow, column = startColumn;
          column <= startColumn + size - 1; column++){
           if(!board.isVisited(row, column)){
              return false;
            }//end if
      }//end for
    }//end if
    return true;
  }//end method isSunk
}//end class Ship
