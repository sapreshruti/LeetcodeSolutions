/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int start = 1;
        int end = n;
        int ans = 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                //mid can possibly be the answer, possibly becaaue there is a chance that more bad version lie to the lfet side of middle element, so search to the left by update end; update the ans in case this is the right answer
                ans = mid;
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return ans;
        
    }
}