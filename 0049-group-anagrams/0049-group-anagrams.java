class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>(); 
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
          char[] ch1 = s.toCharArray();
          Arrays.sort(ch1);
          //String word = Arrays.toString(ch1); can use this also
          String word = new String(ch1);
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