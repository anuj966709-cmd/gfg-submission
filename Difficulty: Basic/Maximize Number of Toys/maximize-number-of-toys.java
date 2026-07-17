class Solution {
    public static int maxToys(int arr[], int k) {
        int count = 0;
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if(sum <= k)
            count++;
            else
            break;
        }
        return count;
    }
}