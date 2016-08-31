//--------- Car Wash------------
public class QueuesExample {

	
	String [] carQueue;
	int top;
	int end; 
	
	int carWashCapacity;  // number of cars that car Wash can accept at given time.
	
	public QueuesExample()
	{
		carWashCapacity = 8;
		carQueue =  new String[carWashCapacity];
		top = 0;
		end = 0;
	}
	
	public boolean addCar(String OwnerName)
	{	
		if(!QueueIsFull())
		{
			if(QueueIsEmpty())
			{
				System.out.println("Queue was empty, pointer reset.");
			}
			carQueue[top++]= OwnerName;
			return true;	
		}
		else
		{
			return false;
		}	
	}

	public String removeCleanedCar()
	{
		if(QueueIsEmpty())
		{
			System.out.println("Queue was empty, pointer reset.");
			return "No car to clean.";
		}
		else
		{
			String CleanedCar = carQueue[end];
			carQueue[end++] = null;
			return CleanedCar;
		}
	}
 
	public boolean QueueIsFull()
	{
		if(top>= (carWashCapacity-1))
		{
			return true;
		}
		return false;
	}
	
	public boolean QueueIsEmpty()
	{
		if(end>top||top ==0)
		{
			top = end = 0;
			return true;
		}
		return false;
	}
	
	public void printAllCars()
	{
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Cars currently in the Car Wash:");
		System.out.println();
		for(int i=top-1; i>=end; i--)
		{
			System.out.println(carQueue[i]+"  ");
		}
		System.out.println("-------------------------------");
		System.out.println();
	}

	public int numberOfCarsInCarWash()
	{
		return top-end;
	}
}
