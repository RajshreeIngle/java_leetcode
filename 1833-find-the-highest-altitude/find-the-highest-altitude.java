class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alt=0;
        int highest = 0;
        for(int i =0; i<n; i++){
            alt+= gain[i];
            highest=Math.max(alt, highest);
        }
        return highest;
    }
}