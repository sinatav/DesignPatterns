package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    private Multiply multiply;
    private Multiplier multiplier;
    private Power power;
    private PowerComputer powerComputer;

    @Test
    void Mul1Test1() {
        multiply = new Mul1();
        multiplier = new Multiplier(multiply);
        assertEquals(4 * 5, multiplier.mul(4, 5));
    }

    @Test
    void Mul2Test1() {
        multiply = new Mul2();
        multiplier = new Multiplier(multiply);
        assertEquals(6 * 8, multiplier.mul(6, 8));
    }

    @Test
    void Mul1Test2() {
        multiply = new Mul1();
        multiplier = new Multiplier(multiply);
        assertEquals(-2 * 11, multiplier.mul(-2, 11));
    }

    @Test
    void Mul2Test2() {
        multiply = new Mul2();
        multiplier = new Multiplier(multiply);
        assertEquals(3 * -10, multiplier.mul(3, -10));
    }

    @Test
    void Pow1Test1() {
        power = new Pow1(new Multiplier(new Mul1()));
        powerComputer = new PowerComputer(power);
        assertEquals((int) Math.pow(2, 3), powerComputer.pow(2, 3));
    }

    @Test
    void Pow2Test1() {
        power = new Pow2(new Multiplier(new Mul1()));
        powerComputer = new PowerComputer(power);
        assertEquals((int) Math.pow(4, 2), powerComputer.pow(4, 2));
    }

    @Test
    void Pow1Test2() {
        power = new Pow1(new Multiplier(new Mul2()));
        powerComputer = new PowerComputer(power);
        assertEquals((int) Math.pow(3, 4), powerComputer.pow(3, 4));
    }

    @Test
    void Pow2Test2() {
        power = new Pow2(new Multiplier(new Mul2()));
        powerComputer = new PowerComputer(power);
        assertEquals((int) Math.pow(5, 2), powerComputer.pow(5, 2));
    }
}
