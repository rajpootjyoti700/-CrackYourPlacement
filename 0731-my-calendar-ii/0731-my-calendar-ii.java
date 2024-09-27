class MyCalendarTwo {

     List<int[]> single = new ArrayList<>();
    List<int[]> doubleBooked = new ArrayList<>();
    
    public MyCalendarTwo() {}
    
    public boolean book(int start, int end) {
        // Check for triple booking by overlapping with double booked intervals
        for (int[] booking : doubleBooked) {
            if (Math.max(start, booking[0]) < Math.min(end, booking[1])) {
                return false; // Triple booking detected
            }
        }
        
        // Add overlapping parts to double bookings
        for (int[] booking : single) {
            if (Math.max(start, booking[0]) < Math.min(end, booking[1])) {
                doubleBooked.add(new int[]{Math.max(start, booking[0]), Math.min(end, booking[1])});
            }
        }
        
        // Add the new event to single bookings
        single.add(new int[]{start, end});
        return true;
    }
}
/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */