class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(k > q.size())
        return q;
        int[] arr = new int[q.size()];
        int i = 0;
        while(q.size() != 0)
        {
            arr[i] = q.remove();
            i++;
        }
        int j = 0;
        k = k-1;
        while(k > j)
        {
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        for(int m = 0; m < arr.length; m++)
        {
            q.add(arr[m]);
        }
        return q;
    }
}