import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("After each test");
    }

    @Test
    public void testAddition() {
        int result = calc.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }
}
