public class Cone extends Shape {

	private double height;
	private double radius;


	public Cone (String name, double height, double radius) {
		this.radius = radius;
		this.height = height;
	}
	public double getSurfaceArea() {
		return Math.PI*radius*(radius + Math.pow(height, 2 + Math.pow(radius, 2)));
	}


	public double getVolume() {

		return Math.PI*radius*(height/3);
	}

}