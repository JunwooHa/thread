package chapter12;

public class eex021 extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	public void run()
	{
		while(!stop)
		{
			if(work)
			{
				System.out.println("ThreadB 작업내용");
			}
			else
			{
				Thread.yield();
			}
			System.out.println("ThreadB 종료");
		}
	}
}
