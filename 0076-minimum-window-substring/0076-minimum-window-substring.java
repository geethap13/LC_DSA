class Solution {
    public String minWindow(String s, String t) {
        // int [] map = new int[128];
        HashMap<Character,Integer> map = new HashMap<>();
    for (char c : t.toCharArray()) {
      //map[c]++;
      map.put(c,map.getOrDefault(c,0)+1);
    }
    int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = map.size();
    while (end < s.length()) {
     char c1 = s.charAt(end);
       if(map.containsKey(c1)){
           map.put(c1,map.get(c1)-1);
           if(map.get(c1) == 0) counter--;
       }
    //   if (map[c1] > 0) counter--;
    //   map[c1]--;

      end++;
      while (counter == 0) {
        if (minLen > end - start) {
          minLen = end - start;
          minStart = start;
        }
         char c2 = s.charAt(start);
        // map[c2]++;
        // System.out.println("c2: "+c2+" map "+ map[c2]);
        // if (map[c2] > 0) counter++;

        if(map.containsKey(c2)){
            if(map.get(c2) == 0) counter++;
           map.put(c2,map.get(c2)+1);
           
       }
        start++;
      }
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}