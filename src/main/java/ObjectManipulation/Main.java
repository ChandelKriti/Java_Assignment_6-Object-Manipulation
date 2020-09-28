package ObjectManipulation;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

	final static Logger logger = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i;
	
		do{

			System.out.println("Enter"+"\n"+" 1 for Rectangle"+"\n"+"2 to compare area of two rectangle"+"\n"+"3 for Complex Number" +"\n"+
					"4 for Distance" + "\n"+"5 for Time"+"\n"+"6 to exit");
			i = scanner.nextInt();
			
			
		switch(i) {
		case 1: 
		{
			System.out.println("Enter length : ");
			double length = scanner.nextDouble();
			System.out.println("Enter breadth : ");
			double breadth = scanner.nextDouble();
			if(length > breadth) {
			Rectangle rectangle = new Rectangle(length, breadth);
			System.out.println("Area is : " + rectangle.area() );
			System.out.println("Perimeter is : " + rectangle.perimeter());
			logger.info("Area is :"+ rectangle.area());}
			else {System.out.println("Length should be greater");}
			break;
		}
		case 2:
		{
			Rectangle rectangle1 = new Rectangle(15d,11d);
			Rectangle rectangle2 = new Rectangle(12d,9d);
			System.out.println(rectangle1.hasSameAreaAs(rectangle1,rectangle2));
			logger.info("result of Area Comparison is :"+ rectangle1.hasSameAreaAs(rectangle1,rectangle2));
			break;
		}
		
		case 3: 
		{
			ComplexNumber c1= new ComplexNumber();
			c1.set(3f, 2f);
			ComplexNumber c2= new ComplexNumber();
			c2.set(9f, 5f);
			ComplexNumber c3= new ComplexNumber();
			c3=c3.sum(c1,c2);
			ComplexNumber c4= new ComplexNumber();
			c4.display(c1,c2,c3);
			break;
		}
		
		case 4: 
		{
			Distance d1 = new Distance();
			d1.set(11,5f);
			Distance d2 = new Distance();
			d2.set(9,4f);
			Distance d3 = new Distance();
			d3=d3.add(d1, d2);
			d1.display(d1,d2,d3);
			break;
		}
		
		case 5:
		{
			Time t1 = new Time();
			t1.set(11,59);
			Time t2 = new Time();
			t2.set(10,15);
			Time t3 = new Time();
			t3=t3.sum(t1, t2);
			t1.display(t1,t2,t3);
			break;
		}
		
		default : 
		{
			
			break;
		}
			
		}
		
		}while(i!=6);
		scanner.close();
	}
	

}
