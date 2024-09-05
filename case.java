import java.util.*;
class case1 {
    public static int minLength(String s) {
        Stack st = new Stack();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && (((char)st.peek() == 'A' && c == 'B') || ((char)st.peek() == 'C' && c == 'D'))) st.pop();
            else    st.push(c);
        }
        return st.size();
    }
    public static void main(String arg[])
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a UpperCase String");
		String s=scn.next();
		System.out.println("Minimum possible length="+minLength(s));
	}
}
