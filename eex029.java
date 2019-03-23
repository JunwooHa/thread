package chapter12;

public class eex029 {
	private String data;
	public synchronized String getdata()
	{
		if(this.data == null)
		{
			try
			{
				wait();
			}catch(InterruptedException e)	{}
		}
		
		String returnvalue = data;
		System.out.println("Consummer Thread�� ���� ������:" + returnvalue);
		data = null;
		notify();
		
		return returnvalue;
	}
	
	public synchronized void setdata(String data)
	{
		if(this.data != null)
		{
			try
			{
				wait();
			}catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("Producer Thread�� ������ ������:" + data);
		notify();
	}
}
