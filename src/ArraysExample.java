
public class ArraysExample {

	String [][] cars;
	
	ArraysExample()
	{
		cars = new String[][]{{"Tesla","Electrice"}
							,{"Dodge-Challenger","v8"}
							,{"Mustang","v4"}
							,{"Dodge-Charger","v8"}
							,{"Ferrari-488","v8"}}; 	
	}
	
	
	public String[][] getAllCars()
	{
		return cars;
	}
	
	public String getEngineType(String nameOfTheCar)
	{
		for(int i=0;i<cars.length;i++)	
		{
			if(nameOfTheCar.equalsIgnoreCase(cars[i][0]))
				return cars[i][1];
		}
		return "No match";
	}
	
	public boolean addNewCar(String carName, String engine)
	{
		
		int i = cars.length+1;
		cars[i][0]= carName;
		cars[i][1]= engine;
		return true;
	}
	
	
	
}
