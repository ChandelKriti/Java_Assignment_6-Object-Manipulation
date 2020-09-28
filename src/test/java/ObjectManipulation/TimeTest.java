package ObjectManipulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TimeTest {
   
	@Test
	public void testInstantiateDefault()  {
	       Time t = new Time(15,9);
	       assertEquals(15,t.getHours());
	       assertEquals(9,t.getMinutes());
	       
	    }
	
	@Test
	public void testIllegalInput()  {
	       try {
	    	   new Time(-3, 5);
	    	   fail("Should raise IllegalArgument Exception");
	       }
	       catch (IllegalArgumentException e) {
	    	   assertTrue(true);
	       }
	       
	    }
	
}
