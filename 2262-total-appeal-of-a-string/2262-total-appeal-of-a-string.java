class Solution {
    public long appealSum(String s) {
        int n = s.length();
        long totalAppeal = 0;
        int[] lastSeen = new int[26];  // To track the last index of each character

        // Initialize lastSeen array to -1 (indicating characters haven't been seen yet)
        for (int i = 0; i < 26; i++) {
            lastSeen[i] = -1;
        }

        long currentSum = 0;
        
        // Iterate through the string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            
            // Calculate contribution of the current character
            // Contribution of current character to the substrings ending at position i
            currentSum += (i - lastSeen[index]);
            
            // Update the last seen index for the current character
            lastSeen[index] = i;
            
            // Add the current sum to the total appeal
            totalAppeal += currentSum;
        }

        return totalAppeal;



    }
}