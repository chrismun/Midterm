package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.*;

import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

public class CuboidTest {

	@Test
	public void ConstructorTest(){
		Cuboid c = new Cuboid(1,4,6);
		double depth = c.getiDepth();
		double length = c.getiLength();
		double width = c.getiWidth();
		assertTrue(depth == 6);
		assertTrue(length == 4);
		assertTrue(width == 1);
		
	}
	@Test
	public void GetSetTest() { 
		Cuboid c = new Cuboid(1,2,3);
		c.setiLength(2);
		c.setiWidth(3);
		c.setiDepth(4);
		assertTrue(c.getiLength() == 2);
		assertTrue(c.getiWidth() == 3);
		assertTrue(c.getiDepth() == 4);
	}
	@Test
	public void AreaTest() {
		Cuboid c = new Cuboid(1,2,3);
		assertTrue(c.area() == 22);
		
	}
	@Test(expected = UnsupportedOperationException.class)
	public void PerimeterTest() {
		Cuboid c = new Cuboid(4,7,3);
		c.perimeter();
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void ExceptionTest() {
		Cuboid c = new Cuboid(7,6,-5);
		c.getiDepth();
	}
	private final SortByArea SortByArea = new SortByArea();
	@Test
	public void SortByAreaTest(){
		Cuboid a = new Cuboid(4,2,7);
		Cuboid  b = new Cuboid(4,2,6);
		
		int result = SortByArea.compare(a,b);
		assertTrue(result == 1);
	}
	private final SortByVolume SortByVolume = new SortByVolume();
	@Test
	public void SortByVolumeTest() {
		Cuboid a = new Cuboid(1,1,2);
		Cuboid  b = new Cuboid(1,1,1);	
		int result = SortByVolume.compare(a,b);
		assertTrue(result == 1);
		
		
	}
	
}
