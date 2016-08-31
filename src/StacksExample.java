
public class StacksExample {

	String [] carStack;
	int top;
	int garageCarCapacity;
	
	public StacksExample() {
		// TODO Auto-generated constructor stub
		garageCarCapacity =  7;
		top = 0;
		carStack = new String[garageCarCapacity];
	}
	
	public void AddNewCarToTheGarage(String carsName)//push
	{
		carStack[top++] = carsName;
	}
	
	public String releaseACar()//pop
	{
		String popedCar = carStack[--top];
		carStack[top]= null;	
		return popedCar;
	}
	
	public int numbersOfCarsInGarage()
	{
		return top;
	}
	
	public void printCarStack()
	{
		for(int i=0;i<carStack.length;i++)
		{
			System.out.println(carStack[i]+"  ");
		}
		
	}
	
	
}
