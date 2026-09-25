class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        int i = 0;
        while (i < strs.length) {
            char[] elem = strs[i].toCharArray();

            Arrays.sort(elem);

            String key = new String(elem);

            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);

                map.put(key, list);
            }

            i++;
        }

        return new ArrayList<>(map.values());
    }
}
