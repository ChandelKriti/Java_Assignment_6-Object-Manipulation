package ObjectManipulation;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		
		return breadth;
		
	}

	public void setBreadth(double breadth) {
		
		this.breadth = breadth;
		
	}

		
	public double area() {
		return getLength() * getBreadth();
	}
	
	public double perimeter() {
		
		return  2*(getLength() + getBreadth());
	}
	
	public boolean hasSameAreaAs(Rectangle r1 ,Rectangle r2) {
		if(r1.area() == r2.area()) {
			return true;
		}
		return false;
	}

	
}
