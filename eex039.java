package chapter12;

import java.util.Map;
import java.util.Set;

public class eex039 {
	public static void main(String[] args)
	{
		eex037 autosave = new eex037();
		autosave.setName("AutoSaveThread");
		autosave.setDaemon(true);
		autosave.start();
		
		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();	
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads)
		{
			System.out.println("Name:" + thread.getName() + ((thread.isDaemon())? "(����)" : "(��)"));
			System.out.println("\t" + "�Ҽӱ׷�" + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
