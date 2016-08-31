import static org.junit.Assert.*;

import org.junit.Test;

public class GenericsExampleTest {

	@Test
	public void testPrintCost() {
		
		String sellersName1 = "SFOcarSeller";
		String buyerName1  = "Gaurang";
		String car1 = "Tesla";
		int costUSD1 = 60000;
		
		GenericsExample ge1 = new GenericsExample();
		ge1.setOrder(sellersName1, buyerName1, car1, costUSD1);
		
		assertEquals(ge1.printCost(),60000);
		
		String sellersName2 = "SJSUcarSeller";
		String buyerName2  = "Amey";
		String car2 = "Audi";
		int costUSD2 = 30000;
		
		GenericsExample ge2 = new GenericsExample();
		ge2.setOrder(sellersName2, buyerName2, car2, costUSD2);
		
		assertEquals(ge2.printCost(),30000);
	}

}
