package ObjectManipulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class DistanceTest {

	@Test
	public void testInstantiateDefault()  {
	       Distance d = new Distance(1,1.0f);
	       assertEquals(1,d.getFeet());
	       assertEquals(1.0,d.getInches(),0);
	       
	    }
	
	@Test
	public void testIllegalInput()  {
	       try {
	    	   new Distance (-10, 5.0f);
	    	   fail("Should raise IllegalArgument Exception");
	       }
	       catch (IllegalArgumentException e) {
	    	   assertTrue(true);
	       }
	       
	    }
}
