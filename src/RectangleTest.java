import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {


    Rectangle testRect;

    @Before
    public void setUp() throws Exception {
        testRect = new Rectangle(4.2, 2);
    }

    @Test(expected = Exception.class)
    public void testBadConstructor() throws Exception {
        testRect = new Rectangle(-2.3, 3);
    }

    @Test
    public void getArea() throws Exception {
        assertEquals(testRect.getArea(), 8.4, 0.001);
    }

    @Test
    public void getPerimeter() throws Exception {
        assertEquals(testRect.getPerimeter(), 12.4, 0.001);
    }
}