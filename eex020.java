package chapter12;

public class eex020 extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	public void run()
	{
		while(!stop)
		{
			if(work)
			{
				System.out.println("ThreadA �۾�����");
			}
			else
			{
				Thread.yield();
			}
			System.out.println("ThreadA ����");
		}
	}
}
