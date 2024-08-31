class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> lastSeenIndex = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < cards.length; i++) {
            int cardValue = cards[i];
            
            if (lastSeenIndex.containsKey(cardValue)) {
                // Calculate the distance between current and previous occurrence
                int prevIndex = lastSeenIndex.get(cardValue);
                int length = i - prevIndex + 1;
                minLength = Math.min(minLength, length);
            }
            
            // Update the last seen index for the current card
            lastSeenIndex.put(cardValue, i);
        }
        
        return minLength == Integer.MAX_VALUE ? -1 : minLength;

    }
}