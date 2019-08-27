public class PolarBear extends Animal {
    public PolarBear() {
        super(150, 300);
    }

    public void hunt(Penguin[] penguins) {
        Penguin penguin = penguins[MathHelper.getRandomNumber(0, penguins.length)];

        hunt(penguin);
    }

    public void hunt(Penguin penguin) {
        penguin.die();
        this.feed(penguin.getEnergy());
    }
}
