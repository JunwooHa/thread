package chapter12;

public class eex025 {
	public synchronized void methodA()
	{
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try
		{
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB()
	{
		System.out.println("ThreadB의 methodA() 작업 실행");
		notify();
		try
		{
			wait();
		}catch(InterruptedException e) {}
	}
}
