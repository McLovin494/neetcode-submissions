class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hash_set=set()
        if len(nums)==0:
            return 0
        for el in nums:
            hash_set.add(el)
        i=0
        longest=1
        while i< len(nums):
            count=1
            elem=nums[i]
            if elem-1 not in hash_set:
                while elem+1 in hash_set:
                    count+=1
                    longest=max(longest,count)
                    elem=elem+1
            i+=1
        return longest