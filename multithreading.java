import java.util.*;
public class multithreading 
{
	public static void main(String args[])
	{
		Number n = new Number();
		n.start();
	}
}
class fn extends Thread
{
	int x;
	fn(int n)
	{
		x = n;
	}
	public void run()
	{
		System.out.println("Sleeping for " + x + " milliseconds ");
		try
		{
			Thread.sleep(x);
		}
		catch (InterruptedException ex) 
		{
			System.out.println(ex);
		}
	}
}
class Number extends Thread
{
	public void run()
	{
		Random random = new Random();
		for(int i =0; i<10; i++)
		{
			int millis = random.nextInt(100,1000);
			fn f = new fn(millis);
			f.start();
			try 
			{
				Thread.sleep(1000);
				//Time in milliseconds after which a thread has to stop executing
				//this thread stops after 1000ms
			} 
			catch (InterruptedException ex) 
			{
				System.out.println(ex);
			}
		}
	}
}
