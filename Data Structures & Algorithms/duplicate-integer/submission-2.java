class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for(int value:map.values()){
            System.out.println(value);
            if( value>1) return true;

        }
        return false;
    }
}