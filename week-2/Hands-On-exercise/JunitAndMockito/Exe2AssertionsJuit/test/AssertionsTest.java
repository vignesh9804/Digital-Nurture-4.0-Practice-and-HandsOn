import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    MathUtils utils = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, utils.add(2, 3));
    }

    @Test
    public void testIsEven() {
        assertTrue(utils.isEven(4));
        assertFalse(utils.isEven(5));
    }

    @Test
    public void testNullAndNotNull() {
        assertNull(utils.getNullString());
        assertNotNull(utils.getObject());
    }
}
