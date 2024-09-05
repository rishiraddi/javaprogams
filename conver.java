import java.util.*;
class conver
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int converr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element "+(i+1));
			arr[i]=scn.nextInt();
		}
		System.out.print("Initial array-");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
			converr[i]=arr[i]+max(arr,i);
		}
		System.out.print("Final array-");
		System.out.println(Arrays.toString(converr));
	}
	public static int max(int arry[],int x)
	{
		int m=arry[0];
		for(int j=0;j<=x;j++)
		{
			if(arry[j]>m)
			{
				m=arry[j];
			}
		}
		return m;
	}
}
		
		
			
		
			
