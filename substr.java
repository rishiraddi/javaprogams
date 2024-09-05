import java.util.*;
class substr {
    public static int BalancedSubstring(String s) {
        int cnt0 = 0, cnt1 = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length();) {
            while (i < s.length() && s.charAt(i) == '0') {
                cnt0++; i++;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                cnt1++; i++;
            }
            maxLen = Math.max(maxLen, 2 * Math.min(cnt0, cnt1));
            cnt0 = cnt1 = 0;    
        }    
        return maxLen;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a binary string");
		String s=scn.next();
		System.out.println("Length of balanced string="+BalancedSubstring(s));
	}
}
