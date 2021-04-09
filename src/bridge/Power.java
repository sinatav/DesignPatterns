package bridge;

public abstract class Power {
    protected Multiplier multiplier;

    public Power(Multiplier multiplier) {
        this.multiplier = multiplier;
    }
    public abstract int pow(int base, int p);
}
