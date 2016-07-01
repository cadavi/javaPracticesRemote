public class Board{
  public static final int BOARD_SIZE = 10;
  public static final boolean HORIZONTAL = true;
  public static final boolean VERTICAL = false;
  public static final int[] placement = {5 ,4 ,3 ,2 ,2 ,1 ,1};
  
  Ship[] ships = new Ship[placement.length];
  Cell[][] grid = new Cell[BOARD_SIZE][BOARD_SIZE];
  
  public Board(){
    populateGrid();
    populateShips();
  }//end const.
  
  public void populateGrid(){
    for(int row = 0; row < BOARD_SIZE; row++){
      for(int col = 0; col < BOARD_SIZE; col++){
        grid[row][col] = new Cell();
      }//end for
    }//end for
  }//end method populateGrid
  
  public void populateShips(){
    for(int i = 0; i < placement.length; i++){
      ships[i] = new Ship(placement[i], this);
    }//end for
  }//end method populateShips
  
  public String toString(){
    String result = "   0 1 2 3 4 5 6 7 8 9\n   - - - - - - - - - - ";
    int line = 0;
    for(Cell[] row:grid){
      result += "\n";
      result += (line++)+" | ";
      for(Cell cell : row){
        result += cell+" ";
      }//end for
    }//end for
    return result;
  }//end method toString
  
  public Cell getElement(int row, int column){
    if((row >= 0 && row < BOARD_SIZE) &&
       (column >= 0 && column < BOARD_SIZE)){
      return grid[row][column];
    }//end if
    return null;
  }//end method getElement
  
  public boolean isFree(int row, int column, boolean direction, int size){
    if(direction == HORIZONTAL){
      for(int newColumn = column; newColumn <= column + size - 1; newColumn++){
        if(getElement(row, newColumn) != null){
          if(grid[row][newColumn].isPartOfShip()){
            return false;
          }//end if
        }else{
          return false;
        }//end if
      }//end for
      return true;
    }else{
      for(int neRow = row; neRow <= row + size - 1; neRow++){
        if(getElement(neRow, column) != null){
          if(grid[neRow][column].isPartOfShip()){
            return false;
          }//end if
        }else{
          return false;
        }//end if
      }//end for
      return true;
    }//end if
  }//end method isFree
  
  public void populate(int row, int column, boolean direction, int size, Ship ship){
    if(direction == HORIZONTAL){
      for(int newColumn = column; newColumn <= column + size - 1; newColumn++){
        grid[row][newColumn].putShip(ship);
      }//end for
    }else{
      for(int newRow = column; newRow <= row + size - 1; newRow++){
        grid[newRow][column].putShip(ship);
      }//end for
    }//end if
  }//end method populate
  
  public void visit(int row, int column){
    grid[row][column].visit();
  }//end method visit
  
  public boolean isAllMarked(){
    for(Cell row[]:grid){
      for(Cell element:row){
        if(element.isPartOfShip() && !element.isVisited()){
          return false;
        }//end if
      }//end for
    }//end for
    return true;
  }//end method isAllMarked
  
  public boolean isPartOfShip(int row, int column){
    return (grid[row][column].isPartOfShip());
  }//end method isPartOfShip
  
  public boolean isVisited(int row, int column){
    return grid[row][column].isVisited();
  }//end method isVisited
  
  public boolean isSunkAt(int row, int column){
    return grid[row][column].isSunk();
  }//end method isSunkAt
}//end class Board