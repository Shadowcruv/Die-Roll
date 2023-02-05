 import java.util.Random;
public class Die {
    private static final int MAX_NUM = 6;
    private static final int MIN_NUM = 1;
    Random random;
    private int dice;

    public Die() {
        random = new Random();
        getroll();
    }

    public void roll() {
        dice = random.nextInt(MAX_NUM - MIN_NUM + 1) + MIN_NUM;
    }

    public int getroll() {
        return dice;
    }


    public static void main(String[] args) {
        Die dice1, dice2;
        dice1 = new Die();
        dice2 = new Die();
        //roll the dice1
        dice1.roll();
        // roll dice2 now
        dice2.roll();

        System.out.println("dice1 is " + dice1.getroll() + ", dice2 is " + dice2.getroll());
    }
}