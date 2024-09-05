import java.util.*;
class createcounter
{
	public static int increment(int a)
	{
		return ++a;
	}
	public static int decrement(int a)
	{
		return --a;
	}
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a value");
		int init=scn.nextInt();
		int arr[]=new int[3];
		arr[0]=increment(init);
		arr[1]=init;
		arr[2]=decrement(init);
		System.out.println("Output="+Arrays.toString(arr));
	}
}
