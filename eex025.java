package chapter12;

public class eex025 {
	public synchronized void methodA()
	{
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try
		{
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB()
	{
		System.out.println("ThreadB�� methodA() �۾� ����");
		notify();
		try
		{
			wait();
		}catch(InterruptedException e) {}
	}
}
