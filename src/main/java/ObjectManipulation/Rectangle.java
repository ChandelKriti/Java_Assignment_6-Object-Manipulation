package ObjectManipulation;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	private double length1;
	private double breadth1;
	private double length2;
	private double breadth2;
	
	
	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle(double length1, double breadth1, double length2, double breadth2) {
		super();
		this.length1 = length1;
		this.breadth1 = breadth1;
		this.length2 = length2;
		this.breadth2 = breadth2;
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

	
	
	public double getLength1() {
		return length1;
	}

	public void setLength1(double length1) {
		
		this.length1 = length1;
		
	}

	public double getBreadth1() {
		
		return breadth1;
	}

	public void setBreadth1(double breadth1) {
		
		this.breadth1 = breadth1;
	}

	public double getLength2() {
		return length2;
		
	}

	public void setLength2(double length2) {
		
		this.length2 = length2;
		
	}

	public double getBreadth2() {
		return breadth2;
	}

	public void setBreadth2(double breadth2) {
		
		this.breadth2 = breadth2;
		
	}
	
	
	
		
	public double area(double length, double breadth) {
		double area = length * breadth;
		return area;
	}
	
	public double perimeter(double length, double breadth) {
		double perimeter = 2*(length + breadth);
		return perimeter;
	}
	
	public String areaComparison(double length1, double breadth1, double length2, double breadth2) {
		double area1 = length1 * breadth1;
		double area2 = length2 * breadth2;
		String str;
		if(area1 == area2) {
			str="Areas of rectangle1 and rectangle2 are equal";
			return str;
		}
		
		else {
			 str="Areas of rectangle1 and rectangle2 are not equal";
			 return str;
		}
	}

	
}
