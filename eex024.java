package chapter12;

public class eex024 {
	public static void main(String[] args)
	{
		eex023 sumthread = new eex023();
		sumthread.start();
		
		try
		{
			sumthread.join();
		}catch(InterruptedException e)	{}
		System.out.println("1~100 гу:" + sumthread.getsum());
	}
}
