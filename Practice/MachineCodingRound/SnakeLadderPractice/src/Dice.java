import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private Integer minValue;
    private Integer maxValue;

    public Dice() {
        this.maxValue = 6;
        this.minValue = 1;
    }

    public Integer rollDice(){
        Random random = new Random();
        return random.nextInt(minValue, maxValue + 1);
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
}
