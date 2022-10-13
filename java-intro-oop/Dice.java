import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    private int size;
    private int maxSize;
    private int minSize;

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }
    public void throwDice(int size) {
        this.size = size;
        int returnDice = 0;
        Random rand = new Random();

        if (size < minSize) {
            this.size = minSize;
        } else if (size > maxSize) {
            this.size = maxSize;
        }
        returnDice = rand.nextInt(this.size) + 1;
        System.out.println("Dice: " + returnDice);
    }
    public List<Integer> throwDices(int dices) {
        List<Integer> returnDice = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i < dices; i++) {
            returnDice.add(rand.nextInt(this.maxSize) + 1);
        }
        return returnDice;
    }
}
