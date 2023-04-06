class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
    int left = 0, right = 0, maxLen = 0, counter = 0;

    while (right < s.length()) {
      final char c1 = s.charAt(right);
      if (map[c1] > 0) counter++;
      map[c1]++;
      right++;

      while (counter > 0) {
        final char c2 = s.charAt(left);
        if (map[c2] > 1) counter--;
        map[c2]--;
        left++;
      }

      maxLen = Math.max(maxLen, right - left);
    }

    return maxLen;
    }
}