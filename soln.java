import java.util.*;
class soln {
    public static int sumOfMultiples(int n) {
        int ans = 0;
        for (int x = 1; x <= n; ++x) {
            if (x % 3 == 0 || x % 5 == 0 || x % 7 == 0) {
                ans += x;
            }
        }
        return ans;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the max element");
		int m=scn.nextInt();
		System.out.println("Sum="+sumOfMultiples(m));
}
}
