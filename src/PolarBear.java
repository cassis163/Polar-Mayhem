public class PolarBear extends Animal {
    public void hunt(Penguin[] penguins) {
        Penguin penguin = penguins[MathHelper.getRandomNumber(0, penguins.length)];

        hunt(penguin);
    }

    public void hunt(Penguin penguin) {
        penguin.die();
    }
}
