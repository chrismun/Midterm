package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.*;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;
public class RectangleTest {

	@Test
	public void ConstructorTest(){
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,5);
		double length = r.getiLength();
		double width = r.getiWidth();
		assertTrue(length == 5);
		assertTrue(width == 4);
		assertFalse(length==6);
	}
	
	@Test 
	public void SetGetTest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,7);
		r.setiLength(7);
		r.setiWidth(4);
		assertTrue(r.getiLength() == 7);
		assertTrue(r.getiWidth() == 4);
		
	}
	@Test
	public void Areatest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,7);
		assertTrue(r.area() == 28);
	}
	@Test
	public void PerimeterTest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,7);
		assertTrue(r.perimeter() == 22);	
	}
	@Test
	public void compareToTest() {
		pkgShape.Rectangle a = new pkgShape.Rectangle(4,5);
		pkgShape.Rectangle b = new pkgShape.Rectangle(2,5);
		assertTrue(a.compareTo(b)== 1); 
		assertTrue(b.compareTo(a)== -1); 


	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ExceptionTest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(-1,-4);
		
		r.getiWidth();
		r.getiLength();
		
	}
	
}
