package chapter12;

public class ex016 extends Thread{
	private Thread targetThread;
	
	public ex016(Thread targetThread)
	{
		this.targetThread = targetThread;
	}
	public void run()
	{
		while(true)
		{
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� " + state);
			
			if(state == Thread.State.TERMINATED)
			{
				break;
			}
		}
		try
		{
			Thread.sleep(500);
		} catch(Exception e)	{}
	}
}
