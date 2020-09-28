package ObjectManipulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {
    
	@Test
	public void testArea()  {
	       Rectangle rectangle = new Rectangle(15d, 10d);
	       Assert.assertTrue(rectangle.getLength() > rectangle.getBreadth());
	       Assert.assertFalse(rectangle.getLength() <= rectangle.getBreadth());
	       
	    }
	
	@Test
	public void testArea1()  {
	       Rectangle rectangle = new Rectangle(15d,10d);
	       assertEquals(150,rectangle.area(),0);
	       
	    }
	
	@Test
	public void testPerimeter()  {
	       Rectangle rectangle = new Rectangle(15d,10d);
	       assertEquals(50,rectangle.perimeter(),0);
	       
	    }
	
	
	@Test
	public void testIllegalInput()  {
	       try {
	    	   new Rectangle(-3.0, 5.0);
	    	   fail("Should raise IllegalArgument Exception");
	       }
	       catch (IllegalArgumentException e) {
	    	   assertTrue(true);
	       }
	       
	    }
}
