class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>(); 
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
          int[] hash = new int[26];
          for(int i=0;i<s.length();i++){
              hash[s.charAt(i)-'a']++;
          }
          //String word = Arrays.toString(hash); can use this also
          String word = new String(Arrays.toString(hash));
          if(map.containsKey(word)){
              map.get(word).add(s);
          }
          else{
               List<String> newList = new ArrayList<>();
               newList.add(s);
               map.put(word,newList);
               /*
               Or use this
               map.put(word,new ArrayList<>());
               map.get(word).add(s);
               */
          }
        }
         res.addAll(map.values());
         return res;

    }
}