import java.util.*;
class score {
    public static int matrixSum(int[][] nums) {
        int score = 0;
        int n = nums.length;
        int m = nums[0].length;
        for(int[] a :nums)
        {
            Arrays.sort(a);
        }
        for(int i=0;i<m;i++)
        {
            int max = 0;
            for(int j=0;j<n;j++)
            {
                max = Math.max(max,nums[j][i]);
            }
            score+=max;
        }
        return score;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=scn.nextInt();
		System.out.println("Enter number of columns");
		int m=scn.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter elements in row"+(i+1));
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter element"+(j+1));
				arr[i][j]=scn.nextInt();
			}
		}
		System.out.println("Score="+matrixSum(arr));
	}
}
