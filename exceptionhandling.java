import java.util.*;
class exceptionhandling
{
	public static void main(String arg[])
	{
		Scanner reader=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter two values 'a' and 'b'-");
			int a=reader.nextInt();
			int b=reader.nextInt();
			try
			{
				System.out.println("a/b="+(a/b));
				return;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Unable to divide the integer by zero try another value for b");
			}
		}
	}
}
		
