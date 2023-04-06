class Solution {
    public boolean checkInclusion(String s1, String s2) {
         //int[] map = new int[256];
         HashMap<Character,Integer> map = new HashMap<>();
        
        // for(Character ch : s1.toCharArray())map[ch] ++;
        for(Character ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int start = 0;
        int end = 0;
        int counter = s1.length();

        while(end < s2.length()) {
            char ch = s2.charAt(end);
            end ++;
            if(map.containsKey(ch)){
                if(map.get(ch) > 0) counter--;
                 map.put(ch,map.get(ch)-1);
                 
            }
            // if(map[ch] > 0)count --;
            // map[ch] --;

            if(counter == 0)return true;

            if(end - start == s1.length()) {
                ch = s2.charAt(start);
                start ++;
                 if(map.containsKey(ch)){
                     map.put(ch,map.get(ch)+1);
                    if(map.get(ch) > 0) counter++;
          
                }
                // if(map[ch] >= 0)count ++;
                // map[ch] ++;
            }
        }

        return false;
    }
}