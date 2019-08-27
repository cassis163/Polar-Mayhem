import org.w3c.dom.Text;

import java.util.Arrays;

public class Zoop {

    private Penguin[] penguins;
    private final int maxPenguinCount = 3;
    private PolarBear polarBear;
    public final int fishEnergy = 50;
    private TimeHelper timeHelper;
    private final int maxDayCount = 7;

    public enum GameState{
        PLAYING,
        WON,
        LOST
    }

    public Zoop(){
        this.penguins = new Penguin[this.maxPenguinCount];

        for (int i = 0 ; i < this.penguins.length ; i++) {
            this.penguins[i] = new Penguin();
        }

        this.polarBear = new PolarBear();

        this.timeHelper = new TimeHelper(this.maxDayCount);
    }

    public Penguin[] getAllPenguins() {
        return this.penguins;
    }

    public Penguin[] getAlivePenguins() {
        return Arrays.stream(this.getAllPenguins()).filter(p -> p.isAlive()).toArray(Penguin[]::new);
    }

    public PolarBear getPolarBear() {
        return polarBear;
    }

    public void close() {
        TextHelper.showBye();
        System.exit(0);
    }

    public void feedPenguin() {
        int penguinNumber = MathHelper.getRandomNumber(0, getNumberOfAlivePenguins());

        Penguin penguinToFeed = getAllPenguins()[penguinNumber];

        penguinToFeed.feed(this.fishEnergy);
    }

     public void feedPolarBear() {
        if (polarBear.isAlive()) {
            polarBear.feed(this.fishEnergy);
        }
     }

     public int getNumberOfAlivePenguins() {
        return this.getAlivePenguins().length;
     }

     public boolean allAnimalsAlive() {
        return (maxPenguinCount == this.getNumberOfAlivePenguins() && this.getPolarBear().isAlive());
    }

    public GameState getGameState() {
        if (!timeHelper.areDaysLeft() && this.allAnimalsAlive()) {
            return GameState.WON;
        }

        if (!(timeHelper.areDaysLeft() || this.allAnimalsAlive())) {
            return GameState.LOST;
        }

        return GameState.PLAYING;
    }

    public void nextDay() {
        timeHelper.nextDay();
        for (Penguin penguin : this.getAlivePenguins()) {
            penguin.nextDay();
        }

        polarBear.nextDay();
    }

    public void showHelp() {
        TextHelper.showInstructions();
    }

    public void showStatus() {
        TextHelper.showStatus(this.getNumberOfAlivePenguins());
    }

    public void showUnknownCommand(String cmd) {
        TextHelper.showInvalidCommand(cmd);
    }
}
