import java.util.*;
class completeindex {
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] counterForRow = new int[mat.length];
        int[] counterForColumn = new int[mat[0].length];
            
        Map<Integer, Integer> rowOfNumber = new HashMap<>();
        Map<Integer, Integer> colOfNumber = new HashMap<>();
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                rowOfNumber.put(mat[i][j], i);
                colOfNumber.put(mat[i][j], j);
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            int row = rowOfNumber.get(arr[i]);
            int col = colOfNumber.get(arr[i]);
            
            counterForRow[row]++;
            counterForColumn[col]++;
            
            if(counterForRow[row] == mat[0].length || counterForColumn[col] == mat.length) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of elements in  main array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in  main array");
		for(int i=0;i<n;i++)
		{
			System.out.println("element "+(i+1));
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter number of rows of matrix");
		int r=scn.nextInt();
		System.out.println("Enter number of columns of matrix");
		int c=scn.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter elements in rows "+(i+1));
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element"+(j+1));
				mat[i][j]=scn.nextInt();
			}
		}
		System.out.println("Smallest Index="+firstCompleteIndex(arr,mat));
	}
}
