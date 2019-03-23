package chapter12;

public class eex026 extends Thread{
	private eex025 workobject;
	public eex026(eex025 workobject)
	{
		this.workobject = workobject;
	}
	
	@Override
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			workobject.methodA();
		}
	}
}
