public abstract class Animal {
    protected final int energyUsage;

    private boolean alive = true;
    private int energy;
    private final int energyThreshold;

    protected Animal(int energyThreshold, int energyUsage) {
        this.energyThreshold = energyThreshold;
        this.energyUsage = energyUsage;
    }

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

    public int getEnergy() {
        return energy;
    }

    public void nextDay() {
        if (this.isStarving()) this.die();
        this.energy -= this.energyUsage;
    }
}
