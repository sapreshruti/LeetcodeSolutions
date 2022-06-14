class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int low=0;
        while(arr[low]<arr[low+1])
            low++;
        return low;
    }
}