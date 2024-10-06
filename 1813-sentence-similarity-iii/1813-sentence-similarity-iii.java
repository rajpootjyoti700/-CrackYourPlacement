class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
     //if while checking starting index cross the ending index means that
  //one sentence compltly contain the another sentence 
        
        //base case
        if(sentence1.equals(sentence2))
            return true;
        //now split the words
        String[] s1=sentence1.split(" ");
        String[] s2=sentence2.split(" ");
        int s1s=0;
        int s2s=0;
        int s1e=s1.length-1;
        int s2e=s2.length-1;
        
        while(s1s<=s1e && s2s<=s2e && s1[s1s].equals(s2[s2s])){
            s1s++;
            s2s++;
        }
        
        while(s1e>=s1s && s2e>=s2s && s1[s1e].equals(s2[s2e])){
            s1e--;
            s2e--;
        }
        
        return s1s>s1e || s2s>s2e;
    }
}