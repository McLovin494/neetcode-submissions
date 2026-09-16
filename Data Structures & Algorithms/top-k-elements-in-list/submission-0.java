class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int []res=new int[k];
        int idx=0;
        for(int i=buckets.length-1;i>=0&&idx<k;i--){
            if(buckets[i]!=null){
                for(int n:buckets[i]){
                    res[idx++]=n;
                    if(idx==k){
                        break;
                    }
                }
            }
            
        }
        return res;
    }
}