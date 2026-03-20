class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = -1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]) return i;
        }
        for(int i=0;i<nums.length;i++){
            if(target < nums[i]) return i;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(target > nums[i]) return i+1;
        }
        return pos;
    }
}