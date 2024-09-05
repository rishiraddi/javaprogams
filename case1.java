import java.util.*;
class case1 {
    public static int minLength(String s){
        StringBuilder s1=new StringBuilder(s);
     while(true)   
     {
         boolean checker=true;
         for(int i=0;i<s1.length()-1;i++)
         {
             char a=s1.charAt(i);
             char b=s1.charAt(i+1);
             if((a=='A' && b=='B')||(a=='C' && b=='D')){ 
                 s1.deleteCharAt(i);
                 s1.deleteCharAt(i);
                 checker=false;
             }
         }
         if(checker) break;
     }
     return s1.length();   
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a UpperCase String");
		String s=scn.next();
		System.out.println("Minimum possible length="+minLength(s));
	}
}
