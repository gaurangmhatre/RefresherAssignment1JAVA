
public class GenericsExample {

	String sellersName;
	String buyerName;
	String car;
	int costUSD;
	
	public GenericsExample()
	{
		sellersName = "TestSeller";
		buyerName= "TestBuyer";
		car = "TestCar";
		costUSD = 1000;
	}
	
	public void setOrder(String sellersName, String buyerName ,String car, int costUSD)
	{
		this.sellersName = sellersName;
		this.buyerName =  buyerName ;
		this.car = car;
		this.costUSD = costUSD;
	}
	
	public void printTheOrder()
	{
		print(sellersName);
		print(buyerName);
		print(car);
		print(costUSD);
		
		System.out.println();
	}
	
	
	public int printCost()
	{
		return this.costUSD;
	}
	
	public <T> void print(T inputList)
	{
			System.out.print(inputList +"    ");
	}
	
}


