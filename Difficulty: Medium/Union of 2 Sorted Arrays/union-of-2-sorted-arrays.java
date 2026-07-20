class Solution {
    public static ArrayList<Integer> findUnion(int arr[], int brr[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int x = 0;
        int i = 0;
        int j = 0;
        while(i < arr.length && j < brr.length)
        {
            if(l1.size() == 0)
                {
                    if(arr[i] > brr[j])
                    {
                        l1.add(brr[j]);
                        j++;
                    }
                    else if(arr[i] < brr[j])
                    {
                        l1.add(arr[i]);
                        i++;
                    }
                    else
                    {
                        l1.add(arr[i]);
                        i++;j++;
                    }
                }
            else if(arr[i] == brr[j])
            {
                if((int)l1.get(x) != arr[i])
                {
                    l1.add(arr[i]);i++;j++;x++;
                }
                else
                {
                    i++;j++;
                }
            }
            else if(arr[i] > brr[j] && brr[j] != (int)l1.get(x))
            {
                l1.add(brr[j]);j++;x++;
            }
            else if(arr[i] < brr[j] && arr[i] != (int)l1.get(x))
            {
                l1.add(arr[i]);i++;x++;
            }
            else
            {
                if(arr[i] == (int)l1.get(x))
                i++;
                else
                j++;
            }
        }
        while(i < arr.length)
        {
            if(arr[i] != (int)l1.get(x))
            {
                l1.add(arr[i]);
                i++;
                x++;
            }
            else
            i++;
        }
        while(j < brr.length)
        {
            if(brr[j] != (int)l1.get(x))
            {
                l1.add(brr[j]);
                j++;
                x++;
            }
            else
            j++;
        }
        return l1;
    }
}
