class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0 , z1 =0;
        long sum2 = 0 ,z2 =0 ;

        for(int i : nums1){
            sum1+=i;
            if(i==0){
                sum1++;
                z1++;
            }
        }
        for(int j :nums2){
            sum2+=j;
            if(j==0){
                z2++;
                sum2++;
            }
        }

//if there are no zeroes then we cant modify anything that means the sum remain diff
        if((z1==0 && sum2>sum1 ) || (z2 == 0 && sum1>sum2)){
            return -1 ;
        }

return Math.max(sum1,sum2);

    }
}
