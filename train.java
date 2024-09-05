import java.util.*;
class train {
    public static int ArrivalTime(int arr, int del) {
        return (arr+del)%24;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter arrival time");
		int n=scn.nextInt();
		System.out.println("Enter delayed  time(in hours)");
		int m=scn.nextInt();
		System.out.println("New arrival time="+ArrivalTime(n,m));
	}
}
