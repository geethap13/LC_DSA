class Solution {
    /*
     public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
         String s1 = new String(ch1);
         String s2 = new String(ch2);
         if( s1.equals(s2)) return true;
         return false;
    }*/
    
    public boolean isAnagram(String s, String t) {
       int[] freq = new int[256];
        int slen = s.length();
        int tlen = t.length();
        if(slen != tlen) return false;
        for(int i=0;i<slen;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq[ch1 - '0']++;
            freq[ch2 - '0']--;
        }

        for(int i:freq){
            if(i!=0) return false;
        }
        return true;
    }
}