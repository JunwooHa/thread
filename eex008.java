package chapter12;

public class ex008 {
	public static void main(String[] args)
	{
		Thread mainthread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�:" + mainthread.getName());
		
		ex006 threadA =new ex006();
		System.out.println("�۾� ������ �̸�:" + threadA.getName());
		threadA.start();
		
		ex007 threadB = new ex007();
		System.out.println("�۾� ������ �̸�:" + threadB.getName());
		threadB.start();
	}
}
