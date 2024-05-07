public class Board {
    private Cells[][] cells;

    public Board(Integer boardSize) {
        initializeCell(boardSize);
        this.cells = new Cells[boardSize][boardSize];
    }

    private void initializeCell(Integer boardSize){
        cells = new Cells[boardSize][boardSize];
        System.out.println(boardSize);

        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                Cells cell = new Cells();
                cells[i][j] = cell;
            }
        }
        System.out.println("cell is addded");
    }

    public Cells getExactCell(Integer position){
        Integer row = position/ cells.length;
        Integer column = position % cells.length;
//        System.out.println("cells row and column " + cells[row][column]);

        row = row == 10 ? 9 : row;
//        column = column == 0 ? 1 : column;

        System.out.println("position: " + position  + "row: " + row + " col: " + column);



        return cells[row][column];
    }

    public void addSnakeInBoard(Integer snakeStartPosition, Integer snakeEndPosition){
        Jump snakeObj = new Jump();
//        initializeCell(10);
        snakeObj.setStartPosition(snakeStartPosition);
        snakeObj.setEndPosition(snakeEndPosition);

        Cells cell = getExactCell(snakeStartPosition);
        cell.setJump(snakeObj);
    }

    public void addLadderInBoard(Integer ladderStartPosition, Integer ladderEndPosition){
        Jump ladderObj = new Jump();
        ladderObj.setStartPosition(ladderStartPosition);
        ladderObj.setEndPosition(ladderEndPosition);

        Cells cell = getExactCell(ladderStartPosition);
        cell.setJump(ladderObj);
    }
}
