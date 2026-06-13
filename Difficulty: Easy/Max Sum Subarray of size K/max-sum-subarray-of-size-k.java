class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int l = 0;
        int r = k-1;
        for(int i = 0; i < k; i++)
        {
            sum = sum + arr[i];
        }
        int maxsum = sum;
        while(r < n-1)
        {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            if(sum > maxsum)
            maxsum = sum;
        }
        return maxsum;
    }
}