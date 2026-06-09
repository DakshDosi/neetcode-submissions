/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        for(int i=0;i<n-1;i++){
            Interval a = intervals.get(i);
            Interval b = intervals.get(i+1);
            if(a.end>b.start)   return false;
        }
        return true;
    }
}
