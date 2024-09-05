import java.util.*;
class wrapper 
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r=scn.nextInt();
		System.out.println("Enter number of columns");
		int c=scn.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter elements in row"+(i+1));
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter elements in colums"+(j+1));
				arr[i][j]=scn.nextInt();
			}
		}
		while(true)
		{
			System.out.println("Enter '1' to continue or else '0' to exit");
			int a=scn.nextInt();
			if(a==0)
			{
				return;
			}
			System.out.println("Enter '1' for addition");
			System.out.println("Enter '0' to convert to string");
			int s=scn.nextInt();
			if(s==1)
			{
				int d=0;
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						d=d+arr[i][j];
					}
				}
				System.out.println("SUM="+d);
			}
			if(s==0)
			{
				int e=r*c;
				int str[]=new int[e];
				int f=0;
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						str[f]=arr[i][j];
						f++;
					}
				}
				System.out.println("Elements are ="+Arrays.toString(str));
			}
		}
	}
}
				
				
			
				
		
