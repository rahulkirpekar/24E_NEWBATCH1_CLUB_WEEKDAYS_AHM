package multithreaddingtopic.bythread.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread1 thread1 = new MyThread1(resource);
		MyThread2 thread2 = new MyThread2(resource);
		MyThread3 thread3 = new MyThread3(resource);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
