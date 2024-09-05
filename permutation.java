import java.util.*;
class permutation {
    public static int[] commonArray(int[] A, int[] B) {
        int n=A.length;
        int ans[]=new int[n];
        int index=0;
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
         if(A[0]==B[0]){
                ans[index++]=1;
            }else if(A[0]!=B[0]){
                ans[index++]=0;
            }
            s1.add(A[0]);
            s2.add(B[0]);
        for(int i=1;i<n;i++)
        {
            s1.add(A[i]);
            s2.add(B[i]);
            int c=0;
            for(int j:s1){
                if(s2.contains(j))c++;
            }
            ans[index++]=c;
        }
        return ans;

    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int n=scn.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter elements of first array");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element"+(i+1));
			arr1[i]=scn.nextInt();
		}
		System.out.println("Enter elements of second array");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element"+(i+1));
			arr2[i]=scn.nextInt();
		}
		System.out.println("Pefix array="+Arrays.toString(commonArray(arr1,arr2)));
	}
}
