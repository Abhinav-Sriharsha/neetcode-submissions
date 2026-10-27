class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        HashMap<Character,Integer> map= new HashMap<>();
        HashMap<Character,Integer> cap= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            cap.put(t.charAt(i),cap.getOrDefault(t.charAt(i),0)+1);
        }
        System.out.println(map);
        System.out.println(cap);
        if(map.equals(cap))
            return true;
        return false;

    }
}
