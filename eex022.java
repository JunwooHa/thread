package chapter12;

public class eex022 {
	public static void main(String[] args)
	{
		eex020 threada = new eex020();
		eex021 threadb = new eex021();
		
		threada.start();
		threadb.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e)	{}
		threada.work = false;
		
		try {Thread.sleep(3000);} catch(InterruptedException e)	{}
		threadb.work = true;
		
		try {Thread.sleep(3000);} catch(InterruptedException e)	{}
		threada.stop = true;
		threadb.stop = true;
	}
}
