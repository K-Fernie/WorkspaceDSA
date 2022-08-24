import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc1 = new Calculator();
        assertEquals(0,calc1.getValue());
    }

    @Test
    void subtract() {
    }
}