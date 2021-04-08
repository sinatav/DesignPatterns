import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DarkRoastWithMochaAndWhipTests {
    @Test
    void operationTest() {
        Beverage beverage = new Whip(new Mocha(new DarkRoast()));
        assertEquals("DarkRoast Add Mocha Add Whip", beverage.Operation());
    }
}