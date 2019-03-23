package chapter12;

public class eex038 {
	public static void main(String[] args)
	{
		eex037 auto = new eex037();
		auto.setDaemon(true);
		auto.start();
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e) { }
		
		System.out.println("메인 스레드 종료");
	}
}
