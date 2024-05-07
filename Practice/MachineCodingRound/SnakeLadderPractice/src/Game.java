import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Boards boards;
    private Deque<Players> players;
    private Dice dice;
    private Players winner;

    public Game() {
        this.boards = new Boards(10);
        this.players = new LinkedList<>();
        this.dice = new Dice();
        this.winner = null;
        addPlayer();
    }

    public void addPlayer(){
        Players players1 = new Players("1000");
        Players players2 = new Players("2000");


        this.players.add(players1);
        this.players.add(players2);
    }

    public Integer jumpCheck(Integer position){
        Cells cell = boards.getCells(position);

        if(cell.jump != null && cell.jump.getStartPosition() == position){
            return cell.jump.getEndPosition();
        }

        return position;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter snake position: ");
        String str = sc.nextLine();
        String[] positions = str.split(" ");
        boards.addSnake(Integer.valueOf(positions[0]), Integer.valueOf(positions[1]));

        System.out.print("Enter ladder positions: ");
        str = sc.nextLine();
        positions = str.split(" ");
        boards.addLadder(Integer.valueOf(positions[0]), Integer.valueOf(positions[1]));

        while(winner == null){
            Players playerTurn = players.poll();

            Integer playerPosition = playerTurn.getPosition();
            Integer diceNumber = dice.rollDice();
            Integer playerNewPosition = playerPosition+diceNumber;

            if(playerPosition+diceNumber > boards.getBoardSize() * boards.getBoardSize()){
                System.out.println("Player " + playerTurn.getPlayerId() + " current position " + playerPosition + " is not moving bec dice number is more than board size");
                players.add(playerTurn);
                continue;
            }

            playerNewPosition = jumpCheck(playerNewPosition);

            if(playerNewPosition == boards.getBoardSize() * boards.getBoardSize()){
                winner = playerTurn;
            }
            System.out.println("Player " + playerTurn.getPlayerId() + " current position " + playerPosition + " moved to " + playerNewPosition);
            playerTurn.setPosition(playerNewPosition);
            players.add(playerTurn);
        }

        System.out.println("Winner is: " + winner.getPlayerId());
    }


}
















