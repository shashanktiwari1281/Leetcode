class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length;i++){
            int digitcount=0;
            for(int n=nums[i];n>0;n=n/10) digitcount++;
            if(digitcount%2==0) count++;
        }
        return count;
    }
}