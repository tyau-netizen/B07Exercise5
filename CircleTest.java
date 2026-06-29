package exercise4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CircleTest {
	@Test
	public void testValidCircle() {
		Point center = new Point(0,0);
		double radius = 5.0;
		
		Circle c = new Circle(center, radius);
		
		assertEquals(expectedRadius, c.radius, 0.0001, "The radius of your circle was not set correctly");
		assertEquals(expectedCenter, c.center, "The center point was not set correctly");
	}
	
	@Test
    public void testNegativeRadius() {
        Point center = new Point(0, 0);
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(center, -1.0);
        });
    }

    @Test
    public void testZeroRadius() {
        Point center = new Point(0, 0);
        
   
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(center, 0.0);
        });
    }
	
	
	@Test
	public void testComputeArea() {
		Point center = new Point(0, 0);
        Circle c = new Circle(center, 5.0);
        
        assertEquals((Math.PI * 25.0), c.computeArea(), 0.0001);
	}
	
	@Test
	public void testPerimeter() {
		Point center = new Point(0, 0);
        Circle c = new Circle(center, 5.0);
        
        assertEquals((Math.PI * 10.0), c.perimeter(), 0.0001);
	}
	
	@Test
    public void testContainsPointInside() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        Point inPoint = new Point(0, 2);
        
        assertTrue(c.contains(inPoint), "Your circle should contain a point inside its perimeter");
    }

    @Test
    public void testContainsPointOutside() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        Point outPoint = new Point(10.0, 10.0); 
        
        assertFalse(c.contains(outPoint), "Your circle should not contain a point beyond its radius");
    }

    @Test
    public void testContainsPointOnPerimeter() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        Point onPoint = new Point(3.0, 4.0); 
        
        assertTrue(c.contains(onPoint), "Your circle should contain a point exactly on its boundary");
    }
    
    
    @Test
    public void testEqualsSameData() {
        Point center1 = new Point(0, 0);
        Point center2 = new Point(0, 0);
        
        Circle c1 = new Circle(center1, 5.0);
        Circle c2 = new Circle(center2, 5.0);
        
        assertTrue(c1.equals(c2), "Two circles with the identical centers and radii must be equal");
    }
    
    @Test
    public void testHashCodeSameData() {
        Point center1 = new Point(0, 0);
        Point center2 = new Point(0, 0);

        Circle c1 = new Circle(center1, 5.0);
        Circle c2 = new Circle(center2, 5.0);
        
        assertEquals(c1.hashCode(), c2.hashCode(), "Two circles with the identical centers and radii must have the same hashcode");
    }
    
    
    @Test
    public void testToString() {
        Point center = new Point(0, 0);
        Circle c = new Circle(center, 5.0);
        String expectedString = "Circle{center=" + center.toString() + ", radius=5.0}";
        // every Java object gets a toString
        
        assertEquals(expectedString, c.toString(), "The toString output does not match the expected format");
    }
}
