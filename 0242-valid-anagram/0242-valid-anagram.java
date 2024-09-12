class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] ch=t.toCharArray();
        Arrays.sort(ch);
        char[] ch1=s.toCharArray();
         Arrays.sort(ch1);
         return Arrays.equals(ch,ch1);
    }
}