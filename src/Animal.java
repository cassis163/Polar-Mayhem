public abstract class Animal {
    private boolean alive = true;
    private int energy;
    private int energyThreshold;

    public boolean isAlive() {
        return alive;
    }

    public void feed(int energy) {
        energy += energy;
    }

    public void die() {
        alive = false;
    }

    public boolean isStarving() {
        return (alive == true && energy < energyThreshold);
    }
}
