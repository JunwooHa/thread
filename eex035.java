package chapter12;

public class eex035 extends Thread{
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		}catch(InterruptedException e)	{ } 
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
