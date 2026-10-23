class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left_array=[1]*len(nums)
        right_array=[1]*len(nums)
        product_array=[1]*len(nums)
        for i in range(1,len(nums)):
            left_array[i]=nums[i-1]*left_array[i-1]
        for i in range(len(nums)-2,-1,-1):
            right_array[i]=right_array[i+1]*nums[i+1]
        for i in range(0,len(nums)):
            product_array[i]=left_array[i]*right_array[i]
        return product_array