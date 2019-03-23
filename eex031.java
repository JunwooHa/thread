package chapter12;

public class eex031 extends Thread{
	private eex029 databox;
	public eex031(eex029 databox)
	{
		this.databox = databox;
	}
	
	@Override
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			String data =databox.getdata();
		}
	}
}