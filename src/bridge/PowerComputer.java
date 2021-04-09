package bridge;

public class PowerComputer {
    private Power power;

    public PowerComputer(Power power) {
        this.power = power;
    }

    public int pow(int base, int p) {
        return power.pow(base, p);
    }
}
