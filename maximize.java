import java.util.*;
class maximize {
    public static int largestSum(int[] nums, int k) {
        int[] numbers = new int[201];
        int sum = 0;
        int maxAbs = 0;
        for (int n: nums) {
            maxAbs = Math.max(maxAbs, Math.abs(n));
            numbers[100 + n]++;
            sum += n;
        }

        if (maxAbs == 0) {
            return 0;
        }

        while (k-- != 0) {
            int i = 100 - maxAbs;
            while (numbers[i] == 0) {
                i++;
            }
            numbers[i]--;
            numbers[200 - i]++;
            sum -= 2 * (i - 100);
        }

        return sum;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of negotations");
		int k=scn.nextInt();
		System.out.println("Enter number of elements in array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element"+(i+1));
			arr[i]=scn.nextInt();
		}
		System.out.println("Maximum score="+largestSum(arr,k));
	}
}
