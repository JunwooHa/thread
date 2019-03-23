package chapter12;

public class eex040 extends Thread{
	public eex040(ThreadGroup threadgroup,String threadname)
	{
		super(threadgroup,threadname);
	}
	
	@Override
	
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)	
			{ 
				System.out.println(getName() + "interrupted");
				break;
			}
		}
		System.out.println(getName() + "Á¾·áµÊ");
	}
}
