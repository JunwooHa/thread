package chapter12;

import java.util.concurrent.*;

public class eex042 {
	public static void main(String[] args) throws Exception
	{
		ExecutorService executorservice = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<10;i++)
		{
			Runnable runnable = new Runnable()
			{
				public void run()
				{
					ThreadPoolExecutor threadpool = (ThreadPoolExecutor) executorservice;
					int poolsize = threadpool.getPoolSize();
					String threadname = Thread.currentThread().getName();
					System.out.println("[�� ������ ����:" + poolsize + "] �۾� ������ �̸�:" + threadname);
				}
			};
			executorservice.execute(runnable);
			Thread.sleep(10);
		}
		executorservice.shutdown();
	}
}
