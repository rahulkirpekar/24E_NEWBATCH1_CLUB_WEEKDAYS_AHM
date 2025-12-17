package multithreaddingtopic.bythread;


//1. By extending Thread class:-
//-----------------------------
public class MyThread1 extends Thread
{
	// job defined-----run() method----Thread class----Runnable(I)---run()--abstract method
	@Override
	public void run() 
	{
		for (int i = 1; i <=3; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("I : " + i +"----" + Thread.currentThread().getId() +"----"+ Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) 
	{
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();
		MyThread1 th4 = new MyThread1();
		MyThread1 th5 = new MyThread1();
		
		th1.setName("C");
		th2.setName("C++");
		th3.setName("Java");
		th4.setName("Python");
		th5.setName("Scala");
		
		th1.setPriority(Thread.NORM_PRIORITY);// 5
		th2.setPriority(Thread.MIN_PRIORITY);//1
		th3.setPriority(Thread.MAX_PRIORITY);// 10
		th4.setPriority(Thread.NORM_PRIORITY);
		th5.setPriority(Thread.MIN_PRIORITY);

		// th1---object---.start()---normal object---convert into thread 
		th1.start();// th1---callstack(execution area)
//		th1.start();// th1---callstack(execution area)---[IllegalThreadStateException]
		
//		try 
//		{
////			th1.join();
//			th1.join(500);
//		} catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		
		
		th2.start();// th2---callstack(execution area)
		th3.start();// th3---callstack(execution area)
		th4.start();// th4---callstack(execution area)
		th5.start();// th5---callstack(execution area)
	}
}
