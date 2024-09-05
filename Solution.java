class Solution {
    public static int maxDivScore(int[] nums, int[] divisors) {
        
       
        int a=0;
        int aa=Integer.MAX_VALUE;
        for(int i=divisors.length-1;i>=0;i--){
            int d=divisors[i];
             int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%d==0)
                c++;
            }
            if(c==a){
                aa=Math.min(aa,d);

            }
            if(c>a){
                a=c;
                aa=d;

            }
        }
        return aa;
    }
    public static void main(String arg[])
    {
		int div[]={5,2,3};
		int num[]={4,7,9,3,9};
		System.out.println("Maximum divsiblity score= "+ maxDivScore(num,div));
	}
}
