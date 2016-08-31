import static org.junit.Assert.*;

import org.junit.Test;

public class StacksExampleTest {

	@Test
	public void testNumbersOfCarsInGarage() {
		String Tesla1 = "Tesla1";
		String Tesla2 = "Tesla2";
		String Dodge1 = "Dodge1";
		String Audi1 = "Audi1";
		String Dodge2 = "Dodge2";
		
		StacksExample se =  new StacksExample();
		assertEquals(se.numbersOfCarsInGarage(),0);
		
		se.AddNewCarToTheGarage(Tesla1);
		se.AddNewCarToTheGarage(Tesla2);
		se.AddNewCarToTheGarage(Dodge1);
		assertEquals(se.numbersOfCarsInGarage(),3);
		
		se.AddNewCarToTheGarage(Audi1);
		se.AddNewCarToTheGarage(Dodge2);
		
		assertEquals(se.numbersOfCarsInGarage(),5);
	}
}
