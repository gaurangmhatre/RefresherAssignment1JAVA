import static org.junit.Assert.*;

import org.junit.Test;

public class InterfacesExampleTest {
	
	@Test
	public void testGetTheKeys() {
		InterfacesExample ie =  new InterfacesExample();
		assertEquals(ie.getTheKeys(false),false);
	}

	@Test
	public void testStartTheCar() {
		InterfacesExample ie =  new InterfacesExample();
		assertEquals(ie.startTheCar(),true);
		
	}

	@Test
	public void testSpeedUp() {
		InterfacesExample ie =  new InterfacesExample();
		assertEquals(ie.speedUp(),true);
		
	}

	@Test
	public void testSpeedDown() {
		InterfacesExample ie =  new InterfacesExample();
		assertEquals(ie.speedDown(),true);
	}

	@Test
	public void testPushBrakes() {
		InterfacesExample ie =  new InterfacesExample();
		assertEquals(ie.pushBrakes(),true);
	}

}

/*
InterfacesExample ie =  new InterfacesExample();

System.out.println("--Step 0--");

System.out.println("No keys");
if(ie.getTheKeys(false));//No keys
{
	System.out.println("You need keys, Sorry!");
}

System.out.println("---------------------------");
System.out.println("trying again");

System.out.println("--Step 0--");

System.out.println("I have keys this time.");
if(ie.getTheKeys(true));//No keys
{
	System.out.println("Enjoy, You can start your car now.");
}

System.out.println("--Step 1--");

if(ie.startTheCar())
{
	System.out.println("Wow, You can accelerate now!");
}

System.out.println("--Step 2--");

if(ie.speedUp())
{
	System.out.println("Hey, That is really fast. Hit brakes please!");
}

System.out.println("--Step 3--");

if(ie.PushBrakes())
{
	System.out.println("That was good, try not to rush!");
}*/

