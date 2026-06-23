class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(arr[0]);
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            sum = sum + arr[i];
            l1.add(sum);
        }
        return l1;
    }
}