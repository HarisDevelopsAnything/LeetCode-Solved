class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length+nums2.length];
        int i=0,j=0;
        if(nums2.length > nums1.length){
            int temp[] = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int k=0;
        while(k<nums1.length+nums2.length){
            if(j>=nums2.length){
                merged[k] = nums1[i];
                k++;
                i++;
            }
            else if(i>=nums1.length){
                merged[k] = nums2[j];
                k++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }
            else {
                merged[k] = nums2[j];
                j++;
                k++;
            }

            System.out.println(merged[k-1]);
        }
        int ind = merged.length/2;
        if(merged.length%2==0){
            System.out.println(merged[ind]+", "+merged[ind-1]);
            return (merged[ind]+merged[ind-1])/2.0;
        }
        return merged[ind];
    }
}