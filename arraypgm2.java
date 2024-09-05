import java.util.*;
class arraypgm2
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter initial lenght of array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i+1;
		}
		System.out.println("Initial array");
		System.out.println(Arrays.toString(arr));
		fnplusone(arr,n);
	}
	public static void fnplusone(int arry[],int x)
	{
		arry[x]=x+1;
		System.out.println("Resulted array");
		for(int j=1;j<=x;j++)
		{
			System.out.print(arry[j]+",");
		}
	}
}

			
			
