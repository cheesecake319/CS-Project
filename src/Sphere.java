public class Sphere extends Shape{
	
	private double radius;
	
	public Sphere(String name, double radius) {
		this.radius = radius;
	}

	
	public double getSurfaceArea() {
		return 4*Math.PI*Math.pow(radius, 2);
	}

	
	public double getVolume() {
	
		return 4/3*Math.PI*Math.pow(radius, 3);
	}
	
}
