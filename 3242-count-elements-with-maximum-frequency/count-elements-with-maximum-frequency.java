class Solution {
    int maxFreq(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]) temp++;
            }
            if(temp>count) count=temp;
        }
        return count;
    }
    public int maxFrequencyElements(int[] nums) {
        int maxcount = maxFreq(nums);
        System.out.println(maxcount);
        int total = 0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]) c++;
            }
            if(c==maxcount) total+=c; 
        }
        return total/maxcount;
    }
}