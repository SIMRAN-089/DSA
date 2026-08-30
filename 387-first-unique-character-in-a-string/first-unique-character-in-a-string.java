class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> counts = new HashMap<>();

        // Count the frequency of every character
        for(char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Find the first character whose frequency is 1
        for(int i = 0; i < s.length(); i++) {
            if(counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }
}