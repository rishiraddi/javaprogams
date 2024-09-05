import java.util.*;
 
public class mdarr{
  public static void main (String[] args){
    int[][] arr = { { 6 },{ 1, 3},  { } };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+",");
		}
	}
		
    }
}
