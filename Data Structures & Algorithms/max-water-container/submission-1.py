class Solution:
    def maxArea(self, heights: List[int]) -> int:
        total_length=len(heights)-1
        max_area=0
        left=0
        right=len(heights)-1
        while left<right:
           width=right-left
           height=min(heights[left],heights[right])
           area=height*width
           if heights[right]>heights[left]:
            left+=1
           elif heights[left]>heights[right]:
            right-=1
           else:
                left+=1
                right-=1
           max_area=max(area,max_area)
        return max_area