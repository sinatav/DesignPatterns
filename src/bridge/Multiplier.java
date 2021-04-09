package bridge;

public class Multiplier {
    private Multiply multiply;

    public Multiplier(Multiply multiply) {
        this.multiply = multiply;
    }

    public int mul(int op1, int op2) {
        return multiply.mul(op1, op2);
    }
}
