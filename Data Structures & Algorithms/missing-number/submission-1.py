class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nset=set(range(len(nums)+1))
        print(nset)
        for i in range(0,len(nums)):
            if nums[i] in nset:
                nset.remove(nums[i])
        return nset.pop()
            

        