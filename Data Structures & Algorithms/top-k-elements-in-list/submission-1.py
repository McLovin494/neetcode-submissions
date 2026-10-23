class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hash_map={}
        for i in range(len(nums)):
            hash_map[nums[i]]=hash_map.get(nums[i],0)+1
        buckets=[[] for _ in range(0,len(nums)+1)]
        result=[]
        for el,freq in hash_map.items():
            buckets[freq].append(el)
        for i in range(len(buckets)-1,0,-1):
            for el in buckets[i]:
                result.append(el)
                if len(result)==k:
                    return result
        return result
        