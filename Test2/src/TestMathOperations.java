
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TestMathOperations {
    @Test
    public void testMultiply() {
        assertEquals(24, MathOperations.multiply(2, 3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(4.0, MathOperations.divide(8, 2), 0.0001);
        assertThrows(ArithmeticException.class, () -> MathOperations.divide(5, 0));
    }
}

