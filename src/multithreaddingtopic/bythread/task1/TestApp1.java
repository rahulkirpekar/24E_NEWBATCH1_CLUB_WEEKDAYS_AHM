package multithreaddingtopic.bythread.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread1 thread1 = new MyThread1(resource);
		MyThread1 thread2 = new MyThread1(resource);
		MyThread1 thread3 = new MyThread1(resource);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
