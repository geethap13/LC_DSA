class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int ans = 0;
        for(int i=0;i<n;i++){
            int maxFreq = 0;
            freq = new int[26];
            for(int j=i;j<n;j++){
                  freq[s.charAt(j) - 'A']++;
                  maxFreq = Math.max(maxFreq,freq[s.charAt(j) - 'A']);
                  if(j-i+1 - maxFreq >k) break;
                  ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}