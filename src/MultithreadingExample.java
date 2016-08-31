
public class MultithreadingExample extends Thread
{
	// This code will replicate the Tesla Production unit as resource provider. And two retailer will allocate new cars to it's users on multiple threads.
	
	 private Thread t;
	   private String threadName;
	   
	   int TotalNumberOfCarsReadyToSell = 100;
	   
	   int carNumber = 1;
	   MultithreadingExample(String name)
	   {
	       threadName = name;
	       System.out.println("Creating new retailer : " +  threadName );
	   }
	   
	   public void run() 
	   {
	       try 
		   {
	    	  System.out.println("Retailer: " + threadName + ",  Can sell car now."); 
	    	    	Thread.sleep(10000);
	            			         
	     } catch (InterruptedException e) {
	         System.out.println("Retailer  :" +  threadName + " interrupted.");
	    }
	     System.out.println("Retailer :" +  threadName + " is done.");
	   }
	   
	   public void start()
	   {
	      if (t == null)
	      {
	         t = new Thread(this, threadName);
	         t.start ();     
	      }
	    }

}
