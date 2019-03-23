package chapter12;

import java.util.concurrent.*;

public class eex043 {
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[�۾� ó�� ��û]");
		
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				int sum = 0;
				for(int i=1;i<=10;i++)
				{
					sum += i;
				}
				System.out.println("[ó�� ���]" + sum);
			};
		};
		Future future = executor.submit(runnable);
		try
		{
			future.get();
			System.out.println("[�۾� ó�� �Ϸ�]");
		}catch(Exception e)	
		{
			System.out.println("[���� ���� �߻���]" + e.getMessage());
		}
		executor.shutdown();
	}
}
