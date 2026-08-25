class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        HashMap<String,List<String>> map = new HashMap();

        for(String s : strs){
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            String key = new String(cArr);
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
