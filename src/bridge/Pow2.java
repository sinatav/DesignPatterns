package bridge;

public class Pow2 extends Power {
    public Pow2(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public int pow(int base, int p) {
        if (p == 0)
            return 1;

        return multiplier.mul(pow(base, p - 1), base);
    }
}
