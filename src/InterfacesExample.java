
public class InterfacesExample implements InterfaceDrivingRules{

	public boolean getTheKeys(boolean haveKeys)
	{
		if(haveKeys)
		{
			return true;
			
		}
		return false;
	}
	
	public boolean startTheCar()
	{
		return true;
	}
	
	public boolean speedUp()
	{
		return true;
	}
	
	public boolean speedDown()
	{
		return true;
	}
	
	public boolean pushBrakes()
	{
		return true;
	}
	
}
