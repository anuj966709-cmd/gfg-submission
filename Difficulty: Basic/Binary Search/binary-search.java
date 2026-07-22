class Solution {
    public boolean binarySearch(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int mid = n/2;
        while(i <= j)
        {
            if(arr[mid] > k)
            {
                j = mid-1;
            }
            else if(arr[mid] < k)
            {
                i = mid+1;
            }
            else
            return true;
            mid = (i+j)/2;
        }
        return false;
    }
}