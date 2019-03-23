package chapter12;

public class eex032 {
	public static void main(String[] args)
	{
		eex029 databox = new eex029();
		eex030 producer = new eex030(databox);
		eex031 consummer = new eex031(databox);
		
		producer.start();
		consummer.start();
	}
}
