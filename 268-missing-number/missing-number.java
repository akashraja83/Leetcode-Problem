class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int actual = n*(n+1)/2;
        // int sum = 0;
        // for(int num : nums){
        //     sum+=num;
        // }
        // return actual-sum;
        boolean[] freq = new boolean[nums.length+1];
        for(int num : nums){
            freq[num] = true;
        }
        for(int i=0;i<freq.length;i++){
            if(!freq[i]){
                return i;
            }
        }
        return -1;
    }
}