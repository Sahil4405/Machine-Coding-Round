public class Boards {
    private Cells[][] cells;
    private Integer boardSize;

    public Boards(Integer boardSize) {
        this.boardSize = boardSize;
        this.cells = new Cells[boardSize][boardSize];
        initalizeBoard();
    }

    public Cells getCells(Integer position){
        Integer row = position/boardSize;
        Integer column = position % boardSize;

        row = row == 10 ? 9 : row;

        return cells[row][column];
    }

    public void addSnake(Integer startPosition, Integer endPosition){
        Jump snakeObj = new Jump();
        snakeObj.setStartPosition(startPosition);
        snakeObj.setEndPosition(endPosition);

        Cells cell = getCells(startPosition);
        cell.setJump(snakeObj);
    }

    public void addLadder(Integer startposition, Integer endPosition){
        Jump ladderObj = new Jump();
        ladderObj.setStartPosition(startposition);
        ladderObj.setEndPosition(endPosition);

        Cells cell = getCells(startposition);
        cell.setJump(ladderObj);
    }

    public void initalizeBoard(){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                Cells cell = new Cells();
                cells[i][j] = cell;
            }
        }
    }

//    public Cells[][] getCells() {
//        return cells;
//    }
//
//    public void setCells(Cells[][] cells) {
//        this.cells = cells;
//    }

    public Integer getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(Integer boardSize) {
        this.boardSize = boardSize;
    }
}
