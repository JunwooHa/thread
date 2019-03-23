package chapter12;

public class eex030 extends Thread{
	private eex029 databox;
	public eex030(eex029 databox)
	{
		this.databox = databox;
	}
	
	@Override
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			String data ="Data-" + i;
			databox.setdata(data);
		}
	}
}
