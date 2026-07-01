class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,ArrayList<String>> map=new HashMap<>();
            for (int i = 0; i < strs.length; i++) {
                char [] charArray=strs[i].toCharArray();
                Arrays.sort(charArray);
                String sortedString=new String(charArray);
                if(!map.containsKey(sortedString)){
                   
                    map.put(sortedString, new ArrayList<>());
                }
                map.get(sortedString).add(strs[i]);
            }
            List<List<String>> results=new ArrayList<>();
            for(ArrayList<String> values:map.values()){
                System.out.println(values);
                results.add(values);
            }
           return results;
    }
}
