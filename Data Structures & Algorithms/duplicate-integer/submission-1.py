class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashmap={}
        for e in nums:
            hashmap[e]=hashmap.get(e,0)+1
        for k,v in hashmap.items():
            if v>1:
                return True
        return False