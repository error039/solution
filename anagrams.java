public class Solution {
    /*
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        HashMap<String, Vector<String>> map = new HashMap<>();
        Vector<String> result = new Vector();
        for (String s: strs) {
            char[] hash = new char[26];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'a']++;
            }
            String key = String.valueOf(hash);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key, new Vector<String>(Arrays.asList(s)));
            }
        }
        for (Vector<String> vec: map.values()) {
            if (vec.size() > 1) {
                result.addAll(vec);
            }
        }
        return result;
    }
}