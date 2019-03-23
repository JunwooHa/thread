package chapter12;

public class eex023 extends Thread{
	private long sum;
	
	public long getsum()
	{
		return sum;
	}
	
	public void setsum(long sum)
	{
		this.sum = sum;
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		}	
	}
}
