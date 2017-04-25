import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle testCircle;

    @Before
    public void setUp() throws Exception {
        testCircle = new Circle(4.2);
    }

    @Test(expected = Exception.class)
    public void testBadConstructor() throws Exception {
        testCircle = new Circle(-2.3);
    }

    @Test
    public void getArea() throws Exception {
        assertEquals(testCircle.getArea(), 55.41, 0.01);
    }

    @Test
    public void getPerimeter() throws Exception {
        assertEquals(testCircle.getPerimeter(), 26.38, 0.01);
    }

}