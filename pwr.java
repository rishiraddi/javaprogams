import java.util.*;
class pwr {
    public static int sumOfPower(int[] nums) {
    long mod = (long) 1e9 + 7, pre = 0, res = 0;
    Arrays.sort(nums);
    for (long x : nums) {
        res = (res + (x * x % mod) * x % mod + (x * x % mod) * pre % mod) % mod;
        pre = (pre * 2 + x) % mod;
    }
    return (int) res;
}
     public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length of array ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element"+(i+1));
			arr[i]=scn.nextInt();
		}
		System.out.println("power of hero="+sumOfPower(arr));
	}
}
