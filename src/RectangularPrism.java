
//rectangular prism
public class RectangularPrism extends Shape{
	
	private double length;
	private double width;
	private double height;
	
	public RectangularPrism(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
	public double getSurfaceArea() {
		return 2 * ((width * length) + (height * length) + (height * width));
	}
	
	public double getVolume() {
		return length * width * height;
	}  
	
}
