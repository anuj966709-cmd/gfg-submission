class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[n-1]);
        arr[n-1] = -1;
        for(int i = n-2; i >=0; i--)
        {
            if(arr[i] < st.peek())
            {
                int x = st.peek();
                st.push(arr[i]);
                arr[i] = x;
                
            }
            else
            {
                while(st.size() > 0 && arr[i] >= st.peek())
                {
                    st.pop();
                }
                if(st.size() == 0)
                {
                    st.push(arr[i]);
                    arr[i] = -1;
                }
                else
                {
                    int x = st.peek();
                    st.push(arr[i]);
                    arr[i] = x;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr)
            list.add(num);
        return list;
    }
}