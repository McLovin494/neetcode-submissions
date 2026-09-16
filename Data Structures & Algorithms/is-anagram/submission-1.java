class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapOne=new HashMap<>();
        HashMap<Character,Integer>mapTwo=new HashMap<>();
        if (s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            mapOne.put(s.charAt(i),mapOne.getOrDefault(s.charAt(i),0)+1);
            mapTwo.put(t.charAt(i),mapTwo.getOrDefault(t.charAt(i),0)+1);
        }
        System.out.println(mapOne);
        System.out.println(mapTwo);
        return mapOne.equals(mapTwo);
    }
}
