import java.util.*;
class chunk
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in the array");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element"+(i+1));
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter size of chunk array");
		int size=scn.nextInt();
		int k=0;
		for(int i=0;i<n;i+=size)
		{
			System.out.println("Chunk"+(k+1));
			
			for(int j=i;j<i+size;j++)
			{	
				System.out.print(arr[j]);
			}
			k++;
			System.out.println("");
		}
	}
}
