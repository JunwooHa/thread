package chapter12;

public class eex033 extends Thread{
	private boolean stop;
	public void setstop(boolean stop)
	{
		this.stop = stop;
	}
	public void run()
	{
		while(!stop)
		{
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
