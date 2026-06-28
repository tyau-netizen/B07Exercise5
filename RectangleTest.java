import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    public void testValidRectanglePerimeter() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(4, 2);
        Point d = new Point(0, 2);
        Rectangle r = new Rectangle(a, b, c, d);
        assertEquals(12.0, r.perimeter());
    }
    @Test
    public void testRectangleIsNotSquare() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(4, 3);
        Point d = new Point(0, 3);
        Rectangle r = new Rectangle(a, b, c, d);
        assertFalse(r.isSquare());
    }
    @Test
    public void testSquarePerimeter() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(3, 3);
        Point d = new Point(0, 3);
        Rectangle r = new Rectangle(a, b, c, d);
        assertEquals(12.0, r.perimeter());
    }
    @Test
    public void testIsSquare() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(3, 3);
        Point d = new Point(0, 3);
        Rectangle r = new Rectangle(a, b, c, d);
        assertTrue(r.isSquare());
    }
    @Test
    public void testInvalidRectangleException() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(4, 4);
        Point d = new Point(0, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(a, b, c, d);
        });
    }
}