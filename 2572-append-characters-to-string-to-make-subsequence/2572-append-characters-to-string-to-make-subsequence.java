class Solution {
    public int appendCharacters(String s, String t) {
        int sStart = 0; 
        int tStart = 0;
        int sEnd = s.length();
        int tEnd = t.length();

        while(sStart < sEnd && tStart < tEnd){
            if(s.charAt(sStart) == t.charAt(tStart)){
                tStart++;
            }
            sStart++;
        }
        return tEnd - tStart;
    }
}