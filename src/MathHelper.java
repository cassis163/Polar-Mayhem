import java.util.Random;

public class MathHelper {

    private static Random rand = new Random();

    public static int getRandomNumber(int min, int max) {
        int randomNumber = rand.nextInt((max - min) + 1) + min;

        return randomNumber;
    }

}