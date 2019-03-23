package chapter12;

public class eex034 {
	public static void main(String[] args)
	{
		eex033 printThread = new eex033();
		printThread.start();
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)	{}
		
		printThread.setstop(true);
	}
	
}
