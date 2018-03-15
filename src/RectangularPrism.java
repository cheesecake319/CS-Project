
public class RectangularPrism extends Shape{
	//length and width are the length and width of the base
	private double width, length, height; 
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return width * length * height;
	}
	 public RectangularPrism(double width, double length, double height) {
	        this.width = width;
	        this.length = length;
	        this.height = height;
	 }
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		return 2*((width*length)+(height*length)+(height*width));
	}

}
