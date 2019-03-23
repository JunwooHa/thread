package chapter12;

public class eex028 {
	public static void main(String[] args)
	{
		eex025 shared = new eex025();
		
		eex026 a = new eex026(shared);
		eex027 b = new eex027(shared);
		
		a.start();
		b.start();
	}
}
