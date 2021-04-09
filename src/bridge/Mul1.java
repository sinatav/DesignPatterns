package bridge;

public class Mul1 implements Multiply {
    // implement multiply using add
    @Override
    public int mul(int op1, int op2) {
        int sign;
        if ((op1 < 0 && op2 < 0) || (op1 > 0 && op2 > 0))
            sign = 1;
        else
            sign = -1;
        op1 = Math.abs(op1);
        op2 = Math.abs(op2);

        int ans = 0;
        if (op1 == 0 || op2 == 0)
            return 0;
        else
            while (op1-- > 0)
                ans += op2;

            ans *= sign;
            return ans;
    }
}
