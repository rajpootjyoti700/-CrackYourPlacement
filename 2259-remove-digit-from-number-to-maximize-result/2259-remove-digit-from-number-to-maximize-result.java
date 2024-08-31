class Solution {
    public String removeDigit(String number, char digit) {
    
         int n = number.length();
        String maxNumber = "";

        for (int i = 0; i < n; i++) {
            // Check if the current character matches the digit to be removed
            if (number.charAt(i) == digit) {
                // Create the new number by removing the character at index i
                String newNumber = number.substring(0, i) + number.substring(i + 1);
                
                // Compare with the current maximum number and update if necessary
                if (newNumber.compareTo(maxNumber) > 0) {
                    maxNumber = newNumber;
                }
            }
        }

        return maxNumber;

    }
}