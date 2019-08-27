public abstract class Animal {
    protected final int energyUsage;

    private boolean alive = true;
    private int energy;
    private final int energyThreshold;

    protected Animal(int energy, int energyThreshold, int energyUsage) {
        this.energy  = energy;
        this.energyThreshold = energyThreshold;
        this.energyUsage = energyUsage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void feed(int energy) {
        this.energy += energy;
    }

    public void die() {
        alive = false;
    }

    public boolean isStarving() {
        return (this.isAlive() && energy < energyThreshold);
    }

    public int getEnergy() {
        return this.energy;
    }

    public void nextDay() {
        if (this.isStarving()) this.die();
        this.energy -= this.energyUsage;
    }
}
