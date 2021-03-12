//snakeGame: Functionalities
//Move,
// crosses it self->game over,
// Food ->at given interval
// Classes --> Snake, Cell, Board, Game
// To represent a cell of display board.
public enum CellType {
    EMPTY,
    FOOD,
    SNAKE_NODE;
}
public class Cell {
 
    private final int row, col;
    private CellType cellType;
 
    public Cell(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
 
    public CellType getCellType()
    {
        return cellType;
    }
 
    public void setCellType(CellType cellType)
    {
        this.cellType = cellType;
    }
 
    public int getRow()
    {
        return row;
    }
 
    public int getCol()
    {
        return col;
    }
}