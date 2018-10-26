package Chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rect = new Rectangle();
    Rectangle rect2 = new Rectangle(40,4);
    Rectangle rect3 = new Rectangle(35.9,3.5);

    @Test
    public void getArea() {
        assertEquals(1, rect.getArea(), 0);
        assertEquals(160,rect2.getArea(),0);
        assertEquals((35.9*3.5),rect3.getArea(),0);
    }

    @Test
    public void getPerimeter() {
        assertEquals(4, rect.getPerimeter(), 0);
        assertEquals(88,rect2.getPerimeter(),0);
        assertEquals(78.8,rect3.getPerimeter(),0);
    }
}