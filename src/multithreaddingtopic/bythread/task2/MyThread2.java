package multithreaddingtopic.bythread.task2;

public class MyThread2 extends Thread
{
	Table table = null;
	
	public MyThread2(Table table) 
	{
		this.table = table;
	}
	
	@Override
	public void run() 
	{
		table.printTable(10);
	}
}
