import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testSquareRoot() {
        assertEquals(2.0, MathUtils.squareRoot(4.0));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.squareRoot(-1));
    }

    @Test
    void testFactorial() {
        assertEquals(120, MathUtils.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, MathUtils.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
    }

    @Test
    void testSumArray() {
        assertEquals(15, MathUtils.sumArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testIsPrime() {
        assertTrue(MathUtils.isPrime(7));
        assertFalse(MathUtils.isPrime(4));
    }

    // Искусственно провальный тест
    @Test
    void alwaysFailingTest() {
        fail("This test always fails");
    }
}