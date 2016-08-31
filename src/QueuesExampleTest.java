import static org.junit.Assert.*;

import org.junit.Test;

public class QueuesExampleTest {

	@Test
	public void testQueueIsFull() {
		QueuesExample qe =  new QueuesExample();
		
		assertEquals(qe.QueueIsFull(), false);
		
		String Tesla1 = "Elon";
		String Tesla2 = "Austin";
		String Dodge1 = "MKBHD";
		
		qe.addCar(Tesla1);
		qe.addCar(Tesla2);
		qe.addCar(Dodge1);
		qe.addCar(Tesla1);
		qe.addCar(Tesla2);
		qe.addCar(Dodge1);
		qe.addCar(Tesla1);
		qe.addCar(Tesla2);
		
		
		assertEquals(qe.QueueIsFull(), true);
		
	}

	@Test
	public void testQueueIsEmpty() {
		QueuesExample qe =  new QueuesExample();
		
		assertEquals(qe.QueueIsEmpty(), true);
		
		String Tesla1 = "Elon";
		String Tesla2 = "Austin";
		String Dodge1 = "MKBHD";
		
		qe.addCar(Tesla1);
		qe.addCar(Tesla2);
		qe.addCar(Dodge1);
		
		assertEquals(qe.QueueIsEmpty(), false);
			
		 qe.removeCleanedCar();
		 qe.removeCleanedCar();
		 qe.removeCleanedCar();
			 
	}

	@Test
	public void testNumberOfCarsInCarWash() {
		String Tesla1 = "Elon";
		String Tesla2 = "Austin";
		String Dodge1 = "MKBHD";
		String Audi1 = "Gaurang";
		String Dodge2 = "Mark";
		
		QueuesExample qe =  new QueuesExample();
		
		qe.addCar(Tesla1);
		qe.addCar(Tesla2);
		qe.addCar(Dodge1);
		qe.addCar(Audi1);
		qe.addCar(Dodge2);
		
		assertEquals(qe.numberOfCarsInCarWash(), 5);
		
		 qe.removeCleanedCar();
		 qe.removeCleanedCar();
		 qe.removeCleanedCar();
		 
		 assertEquals(qe.numberOfCarsInCarWash(), 2);
		
		 qe.removeCleanedCar();
		 qe.removeCleanedCar();
		 
		 assertEquals(qe.numberOfCarsInCarWash(), 0);
			
	}

}
