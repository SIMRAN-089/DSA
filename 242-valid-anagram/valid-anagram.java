class Solution {
    public boolean isAnagram(String s, String t) {
        int[]freq = new int[26];
        for(char c : s.toCharArray()){
            int index = c -'a';
            freq[index] = freq[index] + 1; 
        }
         for(char c : t.toCharArray()){
            int index = c -'a';
            freq[index] = freq[index] - 1; 
        
    }
    for(int i=0; i<26;i++){
        if(freq[i]!=0){
            return false;
        }
    }
    return true;
}
}