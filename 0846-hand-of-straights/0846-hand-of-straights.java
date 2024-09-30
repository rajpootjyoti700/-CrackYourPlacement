class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        if(n%groupSize!=0)
            return false;
        for(int i=0;i<n;i++){
            pq.add(hand[i]);
        }
        
        while(!pq.isEmpty()){
            int min=pq.poll();
            for(int i=1;i<groupSize;i++){
                if(pq.remove(min+i))
                    continue;
                    else
                        return false;
            }
        }
        return true;
    }
}