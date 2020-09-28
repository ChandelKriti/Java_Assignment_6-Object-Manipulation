package ObjectManipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexNumberTest {

	
	
	@Test
	public void testInstantiateDefault()  {
	       ComplexNumber c = new ComplexNumber(1.0f,1.0f);
	       assertEquals(1.0,c.getReal(),0);
	       assertEquals(1.0,c.getImaginary(),0);
	       
	    }
	

}
