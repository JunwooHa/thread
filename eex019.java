package chapter12;

import java.awt.Toolkit;

public class eex019 {
	public static void main(String[] args)
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<10;i++)
		{
			toolkit.beep();
			
			try
			{
				Thread.sleep(3000);
			} catch(Exception e)	{}
		}
	}
}
