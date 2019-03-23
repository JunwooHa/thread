package chapter12;

public class eex036 {
	public static void main(String[] args)
	{
		eex035 printThread = new eex035();
		printThread.start();
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)	{}
		printThread.interrupt();
	}
}
