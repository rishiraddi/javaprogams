import java.util.*;
class function
{
	public static void main(String arg[])
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a number");
			int n=scn.nextInt();
			int x=fn1(n);
			int y=fn2(x);
			int z=fn3(y);
			System.out.println("Answer="+z);
		}
		public static int fn1(int a)
		{
			return (2*a);
		}
		public static int fn2(int b)
		{
			return (b*b);
		}
		public static int fn3(int c)
		{
			return (c+1);
		}
}
