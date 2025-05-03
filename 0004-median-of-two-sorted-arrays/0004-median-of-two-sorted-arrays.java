class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(k<nums3.length){
            if(i<nums1.length&&j<nums2.length){
                if(nums1[i]<=nums2[j]) {
                    nums3[k]=nums1[i];
                    i++;
                }
                else {
                    nums3[k]=nums2[j];
                    j++;
                }
            }
            else if(i<nums1.length){
                nums3[k]=nums1[i];
                i++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(k%2==0) return (nums3[(k/2)-1]+nums3[(k/2)])/2.0;
        return nums3[k/2];
    }
}