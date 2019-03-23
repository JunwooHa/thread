package chapter12;

import java.util.concurrent.*;

public class eex043 {
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[작업 처리 요청]");
		
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				int sum = 0;
				for(int i=1;i<=10;i++)
				{
					sum += i;
				}
				System.out.println("[처리 결과]" + sum);
			};
		};
		Future future = executor.submit(runnable);
		try
		{
			future.get();
			System.out.println("[작업 처리 완료]");
		}catch(Exception e)	
		{
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}
		executor.shutdown();
	}
}
