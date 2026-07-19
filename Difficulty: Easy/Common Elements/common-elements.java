class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length)
        {
            if(a[i] > b[j])
            {
                j++;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
            else
            {
                l1.add(a[i]);
                i++;
                j++;
            }
        }
        return l1;
    
    }
}