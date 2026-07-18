class Solution {
    void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++)
        {
            int x = i;
            int min = arr[i];
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    x = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[x] = temp;
        }
        
    }
}