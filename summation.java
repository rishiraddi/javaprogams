import java.util.*;
class summation
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scn.nextInt();
		int nums[]=new int[n];
		int init=0,val=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element "+i);
			nums[i]=scn.nextInt();
		}
		if(n==0)
		{
			System.out.println("init= "+init+" Output ="+val);
			return;
		}
		else if(n==1)
		{
			val=fn(init,nums[0]);
		}
		else
		{
			for(int j=0;j<n;j++)
			{
				val=fn(val,nums[j]);
			}
		}
		System.out.println("init= "+init+" Output ="+val);
	}
	public static int fn(int x,int y)
	{
		return(x+y);
	}
}
			
			
			
	
