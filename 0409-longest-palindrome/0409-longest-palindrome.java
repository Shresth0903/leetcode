class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c,0) + 1);
        }
        int length = 0;
        boolean hasOdd = false;

        for(int i : count.values()){
            length += (i / 2) * 2;
            if(i % 2 == 1){
                hasOdd = true;
            }
        }
        if(hasOdd){
            length += 1;
        }
        return length;
    }
}