package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength) {
		if (iWidth <= 0 || iLength <= 0) {
			throw new IllegalArgumentException();
		}
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}



	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}



	public int getiLength() {
		return iLength;
	}



	public void setiLength(int iLength) {
		this.iLength = iLength;
	}



	@Override
	public double area() {
		return iWidth * iLength;
	}
	
	
	@Override
	public double perimeter() {
		return (2 * iWidth) + (2 * iLength);
	}
	
//	public int compareTo(Rectangle r) {
//		if(this.area() > r.area()) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}

	public int compareTo(Object rec) {
		Rectangle r = (Rectangle) rec; 
		if(this.area()<r.area())
			return -1;	
		else if (this.area()>r.area())
			return 1; 
		else 
			return 0; 
		 
	}

}
