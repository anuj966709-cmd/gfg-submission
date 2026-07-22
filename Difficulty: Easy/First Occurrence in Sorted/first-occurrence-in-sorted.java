class Solution {
    public int firstSearch(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int idx = -1;
        while(i <= j)
        {
            int mid = (i+j)/2;
            if(arr[mid] > k)
            j = mid-1;
            else if(arr[mid] < k)
            {
                i = mid+1;
            }
            else
            {
                idx = mid;
                j = mid-1;
            }
        }
        return idx;
    }
}