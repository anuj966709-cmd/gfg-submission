class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = low; i <= high; i++)
        {
            set.add(i);
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(set.contains(arr[i]) == true)
            {
                set.remove(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}