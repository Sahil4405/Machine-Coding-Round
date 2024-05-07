import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private Player winner;
    private Integer boardSize;

    private void initialize() {
        this.boardSize = 10;
        board = new Board(10);
        players = new LinkedList<>();
        dice = new Dice();
        winner = null;
        addPlayer();
        addSnakeAndLadder();
    }

    private void addSnakeAndLadder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("add number of snake");
        Integer numberOfSnake = sc.nextInt();
        while(numberOfSnake > 0){
            System.out.println("insi sna");
            numberOfSnake -= 1;
            Integer startPosition = sc.nextInt();
            Integer endPosition = sc.nextInt();
            addSnake(startPosition, endPosition);
        }

        System.out.println("add number of ladder");
        Integer numberOfLadder = sc.nextInt();
        while(numberOfLadder > 0){
            numberOfLadder -= 1;
            Integer startPosition = sc.nextInt();
            Integer endPosition = sc.nextInt();
            addLadder(startPosition, endPosition);
        }
    }

    private void addPlayer(){
        Player player1 = new Player("Sahil");
        Player player2 = new Player("Harshit");
        players.add(player1);
        players.add(player2);
    }

    private Integer JumpCheck(Integer playerPosition){
//        getExactCell(playerPosition);
        if(playerPosition > boardSize * boardSize){
            return playerPosition;
        }

        Cells cells = board.getExactCell(playerPosition);
        if(cells.jump != null && cells.jump.getStartPosition() == playerPosition){
            return cells.jump.getEndPosition();
        }

        return playerPosition;
    }

    public Game(){
        System.out.println("Lets start the Snake and Ladder Game!!!");
        initialize();
    }

    public void addSnake(Integer startPosition, Integer endPosition){
        board.addSnakeInBoard(startPosition, endPosition);
    }

    public void addLadder(Integer startPosition, Integer endPosition){
        board.addLadderInBoard(startPosition, endPosition);
    }

    public void startGame(){
        while(winner == null){
            Player currentPlayer = players.removeFirst();
            players.add(currentPlayer);

            Integer diceNumber = dice.rollDice();
            if(currentPlayer.getCurrentPosition() + diceNumber > boardSize * boardSize){
                System.out.println("Player " + currentPlayer.getUserName() + " rolled a dice " + diceNumber + " and doesn't moved he's current position is " + currentPlayer.getCurrentPosition());
                continue;
            }
            Integer playerInitialPosition = currentPlayer.getCurrentPosition() + diceNumber;

            Integer playerFinalPositionAfterJump = JumpCheck(playerInitialPosition);

            System.out.println("Player " + currentPlayer.getUserName() + " rolled a dice " + diceNumber + " and moved from " + currentPlayer.getCurrentPosition() + " to " + playerFinalPositionAfterJump);
            currentPlayer.setCurrentPosition(playerFinalPositionAfterJump);
            if(playerFinalPositionAfterJump == boardSize * boardSize){
                winner = currentPlayer;
            }
        }

        System.out.println(winner.getUserName() + " wins the game!!");
    }

}
