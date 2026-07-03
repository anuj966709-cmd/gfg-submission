class Solution {
    public void reverseQueue(Queue<Integer> q) {
        int[] arr = new int[q.size()];
        int i = 0;
        while(q.size() != 0)
        {
            arr[i] = q.remove();
            i++;
        }
        for(int j = arr.length-1; j >=0; j--)
        {
            q.add(arr[j]);
        }
    }
}