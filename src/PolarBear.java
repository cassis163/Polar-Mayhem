public class PolarBear extends Animal {
    public PolarBear() {
        super(1000, 150, 300);
    }

    public void hunt(Penguin[] penguins) {
        if (penguins.length == 0) {
            TextHelper.showNoPenguinToHunt();
            return;
        }
        Penguin penguin = penguins[MathHelper.getRandomNumber(0, penguins.length-1)];
        hunt(penguin);
    }

    public void hunt(Penguin penguin) {
        penguin.die();
        this.feed(penguin.getEnergy());

        TextHelper.showPolarBearEatsPenguin();
    }

    public void nextDay(Penguin[] penguins) {
        this.nextDay();
        if (this.isStarving()) this.hunt(penguins);
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
