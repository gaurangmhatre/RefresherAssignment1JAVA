import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionsExampleTest {

	@Test
	public void testSizeOfTheList() {
		CollectionsExample ce =  new CollectionsExample();
		
		String customerOne = "Sandi";
		String customerTwo = "Mandi";
		String customerThree = "Tim";
		String customerFour = "Nitin";
		String customerFive = "Trisha";
		
		assertEquals(ce.sizeOfTheList(),0);
		
		ce.addNewOrder(customerOne);
		ce.addNewOrder(customerTwo);
		
		assertEquals(ce.sizeOfTheList(),2);
		
		ce.addNewOrder(customerThree);
		ce.addNewOrder(customerFour);
		ce.addNewOrder(customerFive);
		assertEquals(ce.sizeOfTheList(),5);
	}

}
