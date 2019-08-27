public class TimeHelper {

    private int daysLeft;

    public TimeHelper(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void nextDay() {
        daysLeft--;
    }

    public boolean areDaysLeft() {
        return (daysLeft <= 0);
    }

}
