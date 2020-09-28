package ObjectManipulation;

public class ComplexNumber {
	private float real, imaginary;
	
	public ComplexNumber() {
		
	}

	public ComplexNumber(float real, float imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	
	public void set(float real,float imaginary) {
		this.real=real;
		this.imaginary = imaginary;
	}
	
	public float getReal() {
		return real;
	}
	
	public float getImaginary() {
		return imaginary;
	}
	
	ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp= new ComplexNumber();
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		System.out.println(temp);
		return temp;
	}
	
	public void display(ComplexNumber c1, ComplexNumber c2, ComplexNumber c3) {
		System.out.println("1st complex number : "+c1.real + " + "+ c1.imaginary + " +");
		System.out.println("2nd complex number : "+c2.real + " + "+ c2.imaginary + " +");
		System.out.println("Sum of complex number : " + c3.real + " + "+ c3.imaginary + " +");
	}
	
}
