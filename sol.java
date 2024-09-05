import java.util.*;
class sol{
    public static int addMinimum(String word) {
        int ans=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'){
                if(i+1<word.length() && word.charAt(i+1)=='b'){
                    if(i+2<word.length() && word.charAt(i+2)=='c')
                        i+=2;
                    else{
                        ans++;
                        i++;
                    }
                }
                else if(i+1<word.length() && word.charAt(i+1)=='c'){
                    ans++;
                    i++;
                }
                else
                    ans+=2;
            }
            else if(word.charAt(i)=='b'){
                if(i+1<word.length() && word.charAt(i+1)=='c'){
                    ans++;
                    i++;
                }
                else{
                    ans+=2;
                }
            }
            else
                ans+=2;
        }
        return ans;
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a character");
		String c=scn.next();
		System.out.println("Changes="+addMinimum(c));
	}
}
