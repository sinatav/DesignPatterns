package bridge;

public class Pow1 extends Power {
    public Pow1(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public int pow(int base, int p) {
        int ans = 1;
        while (p-- > 0)
            ans = multiplier.mul(ans, base);

        return ans;
    }
}
