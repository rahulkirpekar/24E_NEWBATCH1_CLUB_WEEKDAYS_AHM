package multithreaddingtopic.bythread.task2;

public class MyThread3 extends Thread
{
	Table table = null;
	
	public MyThread3(Table table) 
	{
		this.table = table;
	}
	
	@Override
	public void run() 
	{
		table.printTable(15);
	}
}
