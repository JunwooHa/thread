package chapter12;

public class ex007 extends Thread{
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
