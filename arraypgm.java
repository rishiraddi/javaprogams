import java.util.*;
class arraypgm
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of blocks");
		int m=scn.nextInt();
		int arr[][]=new int[2][m];
		int sum[]=new int[m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter numbers in  block "+(i+1));
				arr[j][i]=scn.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			sum[i]=arr[0][i]+arr[1][i];
		}
		for(int i=0;i<m;i++)
		{
			if(arr[0][i]==arr[1][i])
			{
				System.out.println("Value= "+sum[i]+" Calls=1");
			}
			else
			{
				System.out.println("Value= "+sum[i]+" Calls=2");
			}
		}
	}
}
		
				
