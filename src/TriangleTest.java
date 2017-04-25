import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle testTriangle;

    @Before
    public void setUp() throws Exception {
        testTriangle = new Triangle(4.2, 32, 5,5);
    }

    @Test(expected = Exception.class)
    public void testBadConstructor() throws Exception {
        testTriangle = new Triangle(1, 1, -1, 1);
    }

    @Test
    public void getArea() throws Exception {
        assertEquals(testTriangle.getArea(), 12.5, 0.01);
    }

    @Test
    public void getPerimeter() throws Exception {
        assertEquals(testTriangle.getPerimeter(), 36.2, 0.01);
    }
}