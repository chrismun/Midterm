package pkgShape;

import java.util.Comparator;   

public class Cuboid extends Rectangle {

	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		if (iDepth <= 0)
			throw new IllegalArgumentException();
		this.iDepth = iDepth;
	}

	
	
	public int getiDepth() {
		return iDepth;
	}



	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}



	public double volume() {
		return this.getiLength() * this.getiWidth() * iDepth;
	}
	
	@Override
	public double area() {
		return 2 * ((this.getiLength() * this.getiWidth()) + (this.getiWidth() * iDepth) + (iDepth * this.getiLength()));
	}

	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public int compareTo(Object cube) {
		Cuboid cuboid = (Cuboid) cube; 
		if(this.area()< cuboid.area())
			return -1;	
		else if (this.area() > cuboid.area())
			return 1; 
		else 
			return 0; 
		
	}
	public static class SortByArea implements Comparator<Cuboid> {
		public SortByArea(){
			super();
		}
		public int compare(Cuboid a, Cuboid b) {
			return a.compareTo(b);		
		}
		 
	}
	public static class SortByVolume implements Comparator<Cuboid> {	
		public SortByVolume(){
			super();
		}
		public int compare(Cuboid a, Cuboid b) {
			if(a.volume() < b.volume())
				return -1;	
			else if (a.volume() > b.volume())
				return 1; 
			else 
				return 0; 
		}
		
	}
}
