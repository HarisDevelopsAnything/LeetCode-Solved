class Solution:
    def convToArrow(self, num):
        if len(num)==1:
            return str(num[0])
        return str(num[0])+'->'+str(num[len(num)-1])
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []
        start = 0
        cur = [nums[0]]
        out = []
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]+1:
                cur.append(nums[i])
            else:
                out.append(self.convToArrow(cur))
                cur=[nums[i]]
        out.append(self.convToArrow(cur))
        return out
