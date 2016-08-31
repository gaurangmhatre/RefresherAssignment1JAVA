import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysExampleTest {

	@Test
	public void testgetEngineType() {
				
		
		ArraysExample ae = new ArraysExample();
		
		assertEquals(ae.getEngineType("Tesla"),"Electrice");
		
		assertEquals(ae.getEngineType("Mustang"),"v4");
		
	}
}
