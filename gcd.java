import java.util.*;
class gcd {
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int c = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i] == 1)
            {
                c++;
            }
        }
        if(c > 0)
        {
            return n - c;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            int num = nums[i];
            for(int j=i+1; j<n; j++)
            {
                num = gcd(num, nums[j]);
                if(num == 1)
                {
                    ans = Math.min(ans, j-i);
                    break;
                }
            }
            if(num != 1)
            {
                break;
            }
        }
        if(ans == Integer.MAX_VALUE)
        {
            return -1;
        }
        return n - 1 + ans;
    }
    public static int gcd(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b%a, a); 
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elements "+(i+1));
			arr[i]=scn.nextInt();
		}
		System.out.println("Changes needed="+minOperations(arr));
		}
}
