import java.util.ArrayList;

public class CollectionsExample {

	ArrayList<String> al;
	
	public CollectionsExample() {
		// TODO Auto-generated constructor stub
		al = new ArrayList<String>();
		System.out.println("Initial size of the orders:" + al.size());
	}
	
	public boolean addNewOrder(String orderByName)
	{
		al.add(orderByName);
		System.out.println(orderByName+"'s order is in the list"); 
		return true;
	}
	
	public int sizeOfTheList()
	{
		return al.size();
	}
	
	public void printAllOrders()
	{
		System.out.println("All Orders: "+al);
	}
	
	
}
