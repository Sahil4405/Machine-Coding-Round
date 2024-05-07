import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private Integer min = 1;
    private Integer max = 6;
//    public int Dice(){
//        System.out.println("Dice");
//    }

    public Integer rollDice(){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
