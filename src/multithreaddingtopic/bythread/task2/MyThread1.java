package multithreaddingtopic.bythread.task2;

public class MyThread1 extends Thread
{
	Table table = null;
	
	public MyThread1(Table table) 
	{
		this.table = table;
	}
	
	@Override
	public void run() 
	{
		table.printTable(5);
	}
}
