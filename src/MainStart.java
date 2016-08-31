import java.io.*;
import java.util.Stack;

public class MainStart {

	public static void main(String [] args) 
	{
		try{
			System.out.println("This is the start for all the Application.");
			
			while(true)
			{
				System.out.println();
				System.out.println("Enter");
				
				System.out.println("<1 to access the Queue>");
				System.out.println("<2 to access the Array>");
				System.out.println("<3 to access the Stack> ");
				System.out.println("<4 to access Interface> ");
				System.out.println("<5 to access ArrayList Collection>");
				System.out.println("<6 to access Threaads> ");
				System.out.println("<7 to access the Generics Example>: ");
				
				System.out.println();
				BufferedReader inputChoice = new BufferedReader(new InputStreamReader(System.in)); 
				int choice = Integer.parseInt(inputChoice.readLine());
				
				switch(choice)
				{				
					case 1: AccessQueue();
						break;
					case 2: AccessArray();
						break;
					case 3: AccessStack();
						break;
					case 4: AccessInterface();
						break;
					case 5: AccessCollection();
						break;
					case 6:	AccessMultithreading();
						break;
					case 7: AccessGenerics();
						break;
					default: 
						System.out.println("Please enter valid choice!");				
				}
				
				String sampleWait = inputChoice.readLine();
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
		
		
	}
	
	public static void AccessQueue()
	{
			QueuesExample qe =  new QueuesExample();
			System.out.println("Welcome to our premium car wash");
			
			qe.printAllCars();
			
			String Tesla1 = "Elon";
			String Tesla2 = "Austin";
			String Dodge1 = "MKBHD";
			String Audi1 = "Gaurang";
			String Dodge2 = "Mark";
			
			
			qe.addCar(Tesla1);
			System.out.println("After adding "+Tesla1+", Number of cars in Car Wash: "+qe.numberOfCarsInCarWash());
			qe.addCar(Tesla2);
			System.out.println("After adding "+Tesla1+", Number of cars in Car Wash: "+qe.numberOfCarsInCarWash());
			qe.addCar(Dodge1);
			System.out.println("After adding "+Dodge1+", Number of cars in Car Wash: "+qe.numberOfCarsInCarWash());
			qe.addCar(Audi1);
			System.out.println("After adding "+Audi1+", Number of cars in Car Wash: "+qe.numberOfCarsInCarWash());
			qe.addCar(Dodge2);
			System.out.println("After adding "+Dodge2+", Number of cars in Car Wash: "+qe.numberOfCarsInCarWash());
			
			qe.printAllCars();
			
			System.out.println("released car Owned by : "+ qe.removeCleanedCar());
			System.out.println("Number of cars in Garage: "+qe.numberOfCarsInCarWash());
			
			System.out.println("released car Owned by : "+ qe.removeCleanedCar());
			System.out.println("Number of cars in Garage: "+qe.numberOfCarsInCarWash());
			
			System.out.println("released car Owned by : "+ qe.removeCleanedCar());
			System.out.println("Number of cars in Garage: "+qe.numberOfCarsInCarWash());
			
			qe.printAllCars();
				
			
	}
	
	public static void AccessArray()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			ArraysExample ae =  new ArraysExample();
			System.out.println();
			System.out.println("Currently we have following cars in our record: ");
			System.out.println("CAR             Engine");
			System.out.println("-----------------------");
			
			String cars[][]= ae.getAllCars();
			
			 for(int i = 0; i < cars.length; i++)
			   {
			      for(int j = 0; j < cars[0].length; j++)
			      {
			         System.out.print(cars[i][j]);
			         System.out.print("    ");
			      }
			      System.out.println();
			   }
			 
			 //------------------------------------------------------
			 //Get engine type of a car
			 System.out.println();
			 System.out.println("Get engine type of a car, Enter car's name from above list: ");
			 try{
			 
			 String carName= br.readLine();
			 
			 System.out.println("Engine type of "+carName+" is  "+ae.getEngineType(carName));
			 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 
			 //------------------------------------------------------
			 //Add new car to the list.(work on it later)
			 try{
				 /*System.out.println();
				 System.out.println("Add new car to the list ");
				 
				 System.out.println("Enter car's name:");			 
				 String carNameToInsert= br.readLine();
				 
				 System.out.println("Enter Enter Engine type:");
				 String carEngineTypeToInsert= br.readLine();
				 
				 if(ae.addNewCar(carNameToInsert,carEngineTypeToInsert))
				 {
					 System.out.println("Success!");
					 
					 cars= ae.getAllCars();
						
					 for(int i = 0; i < cars.length; i++)
					   {
					      for(int j = 0; j < cars[0].length; j++)
					      {
					         System.out.print(cars[i][j]);
					         System.out.print("    ");
					      }
					      System.out.println();
					   }
				 }
				 else
				 {
					 System.out.println("Something went wrong!!");
				 }*/
				}catch(Exception e)
			 {
					e.printStackTrace();
			 }
				 
	}
	
	public static void AccessStack()
	{
		StacksExample se =  new StacksExample();
		
		String Tesla1 = "Tesla1";
		String Tesla2 = "Tesla2";
		String Dodge1 = "Dodge1";
		String Audi1 = "Audi1";
		String Dodge2 = "Dodge2";
		
		
		se.AddNewCarToTheGarage(Tesla1);
		System.out.println("After adding "+Tesla1+", Number of cars in Garage: "+se.numbersOfCarsInGarage());
		se.AddNewCarToTheGarage(Tesla2);
		System.out.println("After adding "+Tesla1+", Number of cars in Garage: "+se.numbersOfCarsInGarage());
		se.AddNewCarToTheGarage(Dodge1);
		System.out.println("After adding "+Dodge1+", Number of cars in Garage: "+se.numbersOfCarsInGarage());
		se.AddNewCarToTheGarage(Audi1);
		System.out.println("After adding "+Audi1+", Number of cars in Garage: "+se.numbersOfCarsInGarage());
		se.AddNewCarToTheGarage(Dodge2);
		System.out.println("After adding "+Dodge2+", Number of cars in Garage: "+se.numbersOfCarsInGarage());
		
		
		System.out.println("released car is : "+ se.releaseACar());
		System.out.println("Number of cars in Garage: "+se.numbersOfCarsInGarage());
		
		
		se.printCarStack();
		
		/*
		System.out.println("released car is : "+ se.releaseACar());
		System.out.println("Number of cars in Garage: "+se.numbersOfCarsInGarage());
		

		System.out.println("released car is : "+ se.releaseACar());
		System.out.println("Number of cars in Garage: "+se.numbersOfCarsInGarage());*/
		
		
		
	}

	public static void AccessInterface()
	{
		System.out.println();
		System.out.println("Welcome to your Tesla");
		
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
		
		if(ie.pushBrakes())
		{
			System.out.println("That was good, try not to rush!");
		}
	}

	public static void AccessCollection()
	{
		System.out.println("Welcome to our car retail center, Book your Tesla today!");
		
		CollectionsExample ce =  new CollectionsExample();
		
		String customerOne = "Sandi";
		String customerTwo = "Mandi";
		String customerThree = "Tim";
		String customerFour = "Nitin";
		String customerFive = "Trisha";
		
		
		
		System.out.println("New Customer :" +customerOne);
		ce.addNewOrder(customerOne);
		
		System.out.println("New Customer :" +customerTwo);
		ce.addNewOrder(customerTwo);
		
		ce.printAllOrders();
		
		System.out.println("New Customer :" +customerThree);
		ce.addNewOrder(customerThree);
		
		System.out.println("New Customer :" +customerFour);
		ce.addNewOrder(customerFour);
		
		System.out.println("New Customer :" +customerFive);
		ce.addNewOrder(customerFive);
		
		
		ce.printAllOrders();
	}

	public static void AccessMultithreading()
	{
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";
		String e = "E";
		
		MultithreadingExample me1 = new MultithreadingExample(a);
		MultithreadingExample me2 = new MultithreadingExample(b);
		MultithreadingExample me3 = new MultithreadingExample(c);
		MultithreadingExample me4 = new MultithreadingExample(d);
		MultithreadingExample me5 = new MultithreadingExample(e);
		
			me1.start();
			me2.start();
			me3.start();
			me4.start();
			me5.start();
			
	}

	public static void AccessGenerics()
	{
		System.out.println("Welcome to car booking unit!");
		
		String sellersName1 = "SFOcarSeller";
		String buyerName1  = "Gaurang";
		String car1 = "Tesla";
		int costUSD1 = 60000;
		
		GenericsExample ge1 = new GenericsExample();
		ge1.setOrder(sellersName1, buyerName1, car1, costUSD1);
		
		String sellersName2 = "SJSUcarSeller";
		String buyerName2  = "Amey";
		String car2 = "Audi";
		int costUSD2 = 30000;
		
		GenericsExample ge2 = new GenericsExample();
		ge2.setOrder(sellersName2, buyerName2, car2, costUSD2);
		
		
		String sellersName3 = "NYUcarSeller";
		String buyerName3 = "Sam";
		String car3 = "Dodge";
		int costUSD3 = 50000;
		
		GenericsExample ge3 = new GenericsExample();
		ge3.setOrder(sellersName3, buyerName3, car3, costUSD3);
		
		
		String sellersName4 = "AScarSeller";
		String buyerName4  = "Rick";
		String car4 = "BMW";
		int costUSD4 = 50000;
		
		GenericsExample ge4 = new GenericsExample();
		ge4.setOrder(sellersName4, buyerName4, car4, costUSD4);
		
		
		//Display code
		System.out.println("Printing order one: ");
		ge1.printTheOrder();
		System.out.println();
		
		System.out.println("Printing order two: ");
		ge2.printTheOrder();
		System.out.println();
		
		System.out.println("Printing order three: ");
		ge3.printTheOrder();
		System.out.println();
		
		System.out.println("Printing order four: ");
		ge4.printTheOrder();
		System.out.println();
	}
}
