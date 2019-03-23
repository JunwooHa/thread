package chapter12;

public class eex041 {
	public static void main(String[] args)
	{
		ThreadGroup mygroup = new ThreadGroup("myGroup");
		eex040 work1 = new eex040(mygroup,"workThreadA");
		eex040 work2 = new eex040(mygroup,"workThreadB");
		work1.start();
		work2.start();
		
		System.out.println("[main 스레드 그룹의  list() 메소드 출력 내용]");
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		main.list();
		System.out.println();
		
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출]");
		mygroup.interrupt();
	}
}
